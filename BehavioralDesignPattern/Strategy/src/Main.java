public class Main {
    public static void main(String[] args) {
        Traveler traveler = new Traveler();

        // اختر وسيلة النقل حسب الحاجة
        traveler.setStrategy(new MetroStrategy());  // لو الطريق زحمة
        traveler.travel();  // OutPut -> Travel By Metro

        traveler.setStrategy(new CarStrategy());  // لو كنت مستعجل 
        traveler.travel();  // OutPut -> Travel By Car

        traveler.setStrategy(new BikeStrategy());  // لو الجو حلو ومافيش زحمة
        traveler.travel();  // OutPut -> Travel By Bike
    }
}
