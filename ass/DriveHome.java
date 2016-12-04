package ass;

public class DriveHome {
	public static void main(String[] args) {
		Student jim = new Student();
		jim.name = "Jim";
		
		GoogleMap googlemap = new GoogleMap();
		jim.openGoogleMap(googlemap);
		String departureLocation = "School";
		String arrivalLocation = "Home";
		googlemap.setUpLocation(departureLocation, arrivalLocation);
		Road[] roads = googlemap.displayShortestPath();
		Car car = new Car();
		car.brand = "Toyota";
		car.color = "Silver";
		jim.driveCarToDestination(car, roads, arrivalLocation);
	}

}

class Student{
	String name;
	void openGoogleMap(GoogleMap gm){}
	void driveCarToDestination(Car car, Road[] path , String destination){}
}

class GoogleMap{
	String departureLocation, arrivalLocation;
	int estimatedTime;
	void setUpLocation(String departureLocation, String arrivalLocation){}
	Road[] displayShortestPath(){}
}

class Road{
	String name;
}

class Car{
	String brand, color;
}
