// واجهة الـ Facade
class RestaurantFacade {
    private OrderSystem orderSystem;
    private PaymentSystem paymentSystem;
    private DeliverySystem deliverySystem;

    public RestaurantFacade() {
        orderSystem = new OrderSystem();
        paymentSystem = new PaymentSystem();
        deliverySystem = new DeliverySystem();
    }

    public void placeOrderAndPay(String food, double amount, String address) {
        orderSystem.placeOrder(food);
        paymentSystem.makePayment(amount);
        deliverySystem.deliverOrder(address);
        System.out.println("Your order is placed successfully!");
    }
}