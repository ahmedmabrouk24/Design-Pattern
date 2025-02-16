// استخدام الـ Facade
public class Main {
    public static void main(String[] args) {
        RestaurantFacade restaurant = new RestaurantFacade();
        restaurant.placeOrderAndPay("Pizza", 15.0, "123 Main St");
    }
}