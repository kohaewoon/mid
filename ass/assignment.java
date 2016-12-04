package ass2;

public class assignment {
	public void personType(Person person) {
		int age = person.age;
		boolean gender = person.gender;
		
		if(age < 0){
			System.out.println("You are unborn.");
		}
		else if(age <= 1){
			System.out.println("Infant.");
		}
		else if(age > 1 && age <= 3){
			System.out.println("Toddler.");
		}
		else if(age > 3 && age <= 5){
			System.out.println("Pre Schooler.");
		}
		else if(age > 5 && age <= 6 && gender){
			System.out.println("KG Girl.");
		}
		else if(age > 5 && age <= 6 && !gender){
			System.out.println("KG Boy.");
		}
		else{
			System.out.println("You are an old guy !!");
		}
	}

	
	public void weirdNumber(int n) {
		
		if(n % 2 == 1){
		
			System.out.println("Weird");
		}
		else{
			
			if(n >= 2 && n <= 5){
				System.out.println("Not Weird");
			}
			else if(n >= 6 && n <= 20){
				System.out.println("Weird");
			}
			else if(n > 20){
				System.out.println("Not Weird");
			}
			else
			{
				System.out.println("It's an even number less than or equal to 0.");
			}
		}
	}


	public void isPrime(int n) {
		
		if(n <= 1){
			System.out.println("It's not a prime.");
			return;
		}
		
		for(int i = 2; i <= Math.sqrt(n); i++){
			if(n % i == 0)
			{
				System.out.println("It's not a prime.");
				return;
			}
		}
		
		System.out.println("It's a prime.");
	}
	

	public int[] fibonacciNumber(int n) {
		
		if(n <= 0)
		{
			System.out.println("You didn't get any fibonacci number.");
			return null;
		}
		
		int[] fibNum = new int[n];
		
		for(int i = 0; i < n; i++){
			if(i < 2){
				fibNum[i] = 1;
			}
			else{
				fibNum[i] = fibNum[i - 1] + fibNum[i - 2];
			}
		}
		
		return fibNum;
	}


	public String reverseString(String s) {
		String reverse = "";
		char[] chars = s.toCharArray();
		char temp;
		
		
		for(int i = 0; i < chars.length / 2f; i++){
			temp = chars[i];
			chars[i] = chars[chars.length - 1 - i];
			chars[chars.length - 1 - i] = temp;
		}
		
		reverse = String.valueOf(chars);
		
		return reverse;
	}


	public int[] findTheLargestTwo(int[] nums) {
		if(nums.length < 2){
			System.out.println("The length of array is less than two.");
			return null;
		}
		
		int[] largest = new int[2];
		int first = nums[0], second = nums[1];
		int temp;
		
		if(first < second){
			temp = first;
			first = second;
			second = temp;
		}
	
		for(int i = 2; i < nums.length; i++){
			if(nums[i] > first){
				second = first;
				first = nums[i];
			}
			else if(nums[i] > second){
				second = nums[i];
			}
		}
		
		largest[0] = first;
		largest[1] = second;
		
		return largest;
	}

	
	public void moveZeroes(int[] nums) {
		int nonZeroCount = 0;
		
		for(int i = 0; i < nums.length; i++){
			if(nums[i] != 0){
				nums[nonZeroCount] = nums[i];
				nonZeroCount++;
			}
		}
		
		for(int j = nonZeroCount; j < nums.length; j++){
			nums[j] = 0;
		}
	}
	

	public int addDigits(int n) {
		if(n < 0){
			System.out.println("It's a negative number.");
			return -1;
		}
		int sum = 0;
		int num = n;
		
		while(num > 0){
			sum += num % 10;
			num = num / 10;
			
			if(sum >= 10 && num <= 0){
				num = sum;
				sum = 0;
			}
		}
		
		return sum;
	}
	
	public boolean isUgly(int n) {
		boolean bUgly = false;
	
		if(n <= 0)
			return false;
		
		while(n % 2 == 0){
			n = n / 2;
		}
		while(n % 3 == 0){
			n = n / 3;
		}
		while(n % 5 == 0){
			n = n / 5;
		}
		if(n == 1){
			bUgly = true;
		}
		
		return bUgly;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Assignment2 caseTest = new Assignment2();

		System.out.println("Please enter age : ");
		int age = scanner.nextInt();
		System.out.println("Please enter gender boolean (male -> false, female -> true) : ");
		boolean gender = false;
		String genderString = scanner.next();
		while(!genderString.equals("true") && !genderString.equals("false")){
			System.out.println("Please retry entering gender boolean (male -> false, female -> true) : ");
			genderString = scanner.next();
		}
		gender = Boolean.parseBoolean(genderString);
		Person jim = new Person(age, gender);
		caseTest.personType(jim);
		System.out.println("\n===========================================================\n");

		System.out.println("Please enter a number(Weird Number) : ");
		int num = scanner.nextInt();
		caseTest.weirdNumber(num);
		System.out.println("\n===========================================================\n");

		System.out.println("Please enter a number(Prime Number) : ");
		num = scanner.nextInt();
		caseTest.isPrime(num);
		System.out.println("\n===========================================================\n");

		System.out.println("Find N Fibonacci Number. Please give a number for N : ");
		num = scanner.nextInt();
		int[] fib = caseTest.fibonacciNumber(num);
	
		if(fib != null){
			System.out.print("\n");
			for(int i = 0; i < fib.length; i++)
			{
				System.out.print(fib[i] + ", ");
				if((i + 1) % 20 == 0){
					System.out.print("\n");
				}
			}
		}
		System.out.println("\n===========================================================\n");

		System.out.println("Please enter a String(Reverse String) : ");
		String str = scanner.next();
		String reverse = caseTest.reverseString(str);
		System.out.println("String is reversed : " + reverse);
		System.out.println("\n===========================================================\n");

		System.out.println("Enter the length of the array(Find the Largest Two) : ");
		int length = scanner.nextInt();
		int[] test = new int[length];
		for(int i = 0; i < test.length; i++){
			System.out.println("Enter the element "+ i +" of the array : ");
			test[i] = scanner.nextInt();
		}
		System.out.println("Display the content of the array : ");
		for(int i = 0; i < test.length; i++){
			System.out.print(test[i] + ", ");
		}
		System.out.print("\n");
		int[] largest = caseTest.findTheLargestTwo(test);
		if(largest != null){
			System.out.println("Print the largest two number of the array :");
			for(int i = 0; i < largest.length; i++){
				System.out.println(largest[i]);
			}
		}
		System.out.println("\n===========================================================\n");

		System.out.println("Enter the length of the array(Move Zero) : ");
		length = scanner.nextInt();
		int[] test2 = new int[length];
		for(int i = 0; i < test2.length; i++){
			System.out.println("Enter the element "+ i +" of the array : ");
			test2[i] = scanner.nextInt();
		}
		System.out.println("Display the original array : ");
		for(int i = 0; i < test2.length; i++){
			System.out.print(test2[i] + ", ");
		}
		System.out.print("\n");
		caseTest.moveZeroes(test2);
		System.out.println("Move all zeros to the end of the array :");
		for(int i = 0; i < test2.length; i++){
			System.out.print(test2[i] + ", ");
		}
		System.out.print("\n");
		System.out.println("\n===========================================================\n");

		System.out.println("Please enter a number(Add Digits) : ");
		num = scanner.nextInt();
		System.out.println("The result is : " + caseTest.addDigits(num));			
		System.out.println("\n===========================================================\n");

		System.out.println("Please enter a number(Ugly Number) : ");
		num = scanner.nextInt();
		System.out.println("Is it an ugly number? : " + caseTest.isUgly(num));
	}
	
}

}
