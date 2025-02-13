package mypackage;
public class Main {
    public static void main(String[] args) {
        CarFactory sportsFactory = new SportsCarFactory();
        Engine sportsEngine = sportsFactory.createEngine();
        Tires sportsTires = sportsFactory.createTires();
        
        sportsEngine.start(); // git soutput -> Starting sports engine with high speed!
        sportsTires.roll(); // output -> Sports tires are rolling fast!
        
        System.out.println();
        
        CarFactory familyFactory = new FamilyCarFactory();
        Engine familyEngine = familyFactory.createEngine();
        Tires familyTires = familyFactory.createTires();
        
        familyEngine.start(); // output -> Starting family engine with efficiency!
        familyTires.roll(); // output -> Family tires are rolling smoothly! 
    }
}