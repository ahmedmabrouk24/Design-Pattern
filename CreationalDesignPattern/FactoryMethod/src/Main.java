import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String typeOfCar = sc.nextLine(); // take the type of car from user 
    	Vehicle specificVehicle = VehicleFactory.getVehicle(typeOfCar);
    	specificVehicle.start();
    	specificVehicle.stop();
    	
    	/*
    	// Create a Car object using the factory
        Vehicle car = VehicleFactory.getVehicle("CAR");
        car.start();
        car.stop();

        // Create a Truck object using the factory
        Vehicle truck = VehicleFactory.getVehicle("TRUCK");
        truck.start();
        truck.stop();

        // Create a Motorcycle object using the factory
        Vehicle motorcycle = VehicleFactory.getVehicle("MOTORCYCLE");
        motorcycle.start();
        motorcycle.stop();
        */
    }
}
