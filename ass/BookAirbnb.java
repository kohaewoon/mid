package Testing;

public class BookAirbnb {
	public static void main(String[] args) {
		Tourist jim = new Tourist();
		jim.name = "Jim";
		jim.phoneNumber = "1234567890";
		jim.EmailAddress = "jim@husky.neu.edu";
		
		Airbnb airbnb = new Airbnb();
		jim.loginAirbnb(airbnb);
		
		String location = "Seattle";
		String date = "09/13/2016";
		airbnb.SetFilterCondition(location, date);
		
		House[] houses = airbnb.displayAvailableHouse();
		House houseInterestedIn = jim.findTheHouseInterestedIn(houses);
		jim.bookHouse(houseInterestedIn);
		Householder householder = houseInterestedIn.getHouseholder();
		Money money = jim.payMoneyToHouseholder(householder);
		householder.acceptMoneyFromTourist(money, jim);
		airbnb.getCommissionFromHouseholder(householder);
	}

}

class Tourist{
	String name, phoneNumber, EmailAddress;
	void loginAirbnb(Airbnb air){}
	House findTheHouseInterestedIn(House[] house){}
	void bookHouse(House house){}
	Money payMoneyToHouseholder(Householder hh){}
}

class Airbnb{
	House[] houses;
	String location, date;
	void SetFilterCondition(String location, String date){}
	House[] displayAvailableHouse(){}
	void getCommissionFromHouseholder(Householder hh){}
}

class House{
	String location;
	float price;
	Householder householder;
	String getLocation(){}
	float getPrice(){}
	Householder getHouseholder(){}
}

class Householder{
	String name;
	void acceptMoneyFromTourist(Money m, Tourist t){}
}

class Money{
	float amount;

}
