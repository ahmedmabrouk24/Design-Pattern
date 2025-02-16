// عميل مهتم بالآيفون
public class IphoneCustomer implements Customer {
    @Override
    public void update(boolean isProductAvailable) {
        if (isProductAvailable) {
            System.out.println("IphoneCustomer: Product is available now");
        } else {
            System.out.println("IphoneCustomer: Product is not availableا");
        }
    }
}