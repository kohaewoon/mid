package ass2;

public class assignment3 {
	public int[] findPowerOfThree(int n) {
		int[] pow3 = new int[n];
		
		for(int i = 0; i < n; i++){
			pow3[i] = (int) Math.pow(3, i);
		}
		
		return pow3;
	}

	public int countDigits(int n) {
		int count = 0;
		int num = n;
		
		while(num > 0){
			count++;
			num /= 10;
		}
		
		return n % count;
	}

	public void printNumbers(int n) {
		if(n % 2 == 1){
			for(int i = 0; i < n; i++){
				System.out.print((2 * i + 1) + " ");
			}
		}
		else{
			for(int i = 0; i < n; i++){
				System.out.print((2 * i) + " ");
			}
		}
		System.out.print("\n");
	}


	public int[][] generatePascalsTriangle(int n) {
		int[][] pascals = new int[n][n];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j <= i; j++){
				if(j == 0 || j == i)
					pascals[i][j] = 1;
				else
					pascals[i][j] = pascals[i - 1][j - 1] + pascals[i - 1][j];
			}
		}
		
		return pascals;
	}


	public String reverseVowels(String s) {
		String reverseVowels = "";
		char[] chars = s.toCharArray();
		
		int leftFlag = 0;
		int rightFlag = s.length() - 1;
				
		while(rightFlag > leftFlag){
			char c1 = chars[leftFlag];
			boolean bVowels1 = (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u');
			if(!bVowels1)
				leftFlag++;
			
			char c2 = chars[rightFlag];
			boolean bVowels2 = (c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u');
			if(!bVowels2)
				rightFlag--;
			
			if(bVowels1 && bVowels2){
				// swap
				char temp;
				temp = chars[leftFlag];
				chars[leftFlag] = chars[rightFlag];
				chars[rightFlag] = temp;
				leftFlag++;
				rightFlag--;
			}
		}
		
		return reverseVowels.valueOf(chars);
	}

	
	public int lengthOfLastWord(String str) {
		String[] words = str.split(" ");
		
		if(words[words.length - 1] != null)
			return words[words.length - 1].length();
		else
			return 0;
	}

	
	public String reverseString2(String str) {
		StringBuilder result = new StringBuilder(0);
		StringBuilder temp = new StringBuilder(0);
		
		for(int i = str.length() - 1; i >= 0; i--){
			
			if(str.charAt(i) != ' ')
				temp.append(str.charAt(i));
			
			if(str.charAt(i) == ' ' || i == 0){
				temp.reverse();
				result.append(temp.toString());
				
				if(i != 0)
					result.append(" ");
				
				temp.setLength(0);
			}
		}
		
		return result.toString();
	}

	
	public int checkMessage(String message) {
		int count = 0;
		
		for(int i = 0; i < message.length(); i++){
			if(i % 3 == 0 || i % 3 == 2){
				if(message.charAt(i) != 'S')
					count++;
			}
			else{
				if(message.charAt(i) != 'O')
					count++;
			}
		}
		
		return count;
	}


public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Assignment3 caseTest = new Assignment3();
	
	System.out.println("Enter a number (findPowerOfThree) :");
	int num = sc.nextInt();
	System.out.println(Arrays.toString(caseTest.findPowerOfThree(num)));
	System.out.println("============================================\n");
	
	System.out.println("Enter a number (countDigits) :");
	num = sc.nextInt();
	System.out.println(caseTest.countDigits(num));
	System.out.println("============================================\n");
	
	System.out.println("Enter a number (printNumbers) :");
	num = sc.nextInt();
	caseTest.printNumbers(num);
	System.out.println("============================================\n");
	
	System.out.println("Enter a number (generatePascalsTriangle) :");
	num = sc.nextInt();
	int[][] pascals = caseTest.generatePascalsTriangle(num);
	for(int i = 0; i < num; i++){
		System.out.print("[");
		for(int j = 0; j <= i; j++){
			System.out.print(pascals[i][j]);
			if(j != i){
				System.out.print(", ");
			}
		}
		System.out.print("]\n");
	}
	System.out.println("============================================\n");
	
	System.out.println("Enter a String (reverseVowels) :");
	String s = sc.next();
	System.out.println(caseTest.reverseVowels(s));
	System.out.println("============================================\n");
	
	System.out.println("Enter a String (lengthOfLastWord) :");
	s = sc.nextLine();
	s = sc.nextLine();
	System.out.println(caseTest.lengthOfLastWord(s));
	System.out.println("============================================\n");
	
	System.out.println("Enter a String (reverseString2) :");
	s = sc.nextLine();
	System.out.println(caseTest.reverseString2(s));
	System.out.println("============================================\n");
	
	System.out.println("Enter a String (checkMessage) :");
	s = sc.nextLine();
	System.out.println(caseTest.checkMessage(s));
	System.out.println("============================================\n");
}

}

}
