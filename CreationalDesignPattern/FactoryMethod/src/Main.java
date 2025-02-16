import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String typeOfCar = sc.nextLine(); // take the type of car from user 
    	Vehicle specificVehicle = VehicleFactory.getVehicle(typeOfCar);
    	specificVehicle.start();
    	specificVehicle.stop();
    	
    	/*
    	if (typeOfCar == "car") {
    		Car car = new Car();
        	specificVehicle.start();
        	specificVehicle.stop();
    	}
    	else if (typeOfCar == "truck") {
    		Truck truck = new Truck();
        	specificVehicle.start();
        	specificVehicle.stop();
    	}
    	*/
    }
}
