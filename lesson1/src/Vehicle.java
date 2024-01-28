public class Vehicle {
	// Instance variables
	String make;
	String model;
	int year;
	double fuelLevel;

	// Constructor method to initialize instance variables
	public Vehicle(String make, String model, int year, double fuelLevel) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.fuelLevel = fuelLevel;
	}

	// Method to check if fuel level is low
	public boolean isFuelLow() {
		return fuelLevel < 10.0; // Assuming a low fuel level is below 10 liters
	}


}
