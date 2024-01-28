
public class Main {
    public static void main(String[] args) {
        // Creating a new Vehicle object using the constructor
        Vehicle myCar = new Vehicle("Toyota", "Camry", 2022, 45.5);       
        
        // Accessing the make and model instance variables and printing the statement
        System.out.println("I have a " + myCar.make + " " + myCar.model);
        
        // Access field of the object:
        System.out.println("Fuel level of myCar is: " + myCar.fuelLevel);
        
        // Call method on the object:
        System.out.println("Is mycar low on fuel: " + myCar.isFuelLow());
    }
}