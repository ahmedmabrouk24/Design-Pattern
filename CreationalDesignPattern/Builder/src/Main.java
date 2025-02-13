public class Main {
    public static void main(String[] args) {
        // بنبني السيارة باستخدام builder:
        Car myCar = new Car.CarBuilder()
                        .setEngine("V8")
                        .setColor("Red")
                        .setSunroof(true)
                        .build();

        System.out.println("Engine: " + myCar.getEngine());
        System.out.println("Color: " + myCar.getColor());
        System.out.println("Wheels: " + myCar.getWheels());
        System.out.println("Sunroof: " + myCar.hasSunroof());
    }
}