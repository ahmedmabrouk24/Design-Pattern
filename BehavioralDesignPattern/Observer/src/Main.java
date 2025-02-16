public class Main {
    public static void main(String[] args) {
        // انشاء المخزن (Publisher)
        Store store = new Store();

        // انشاء العميل المهتم بالآيفون (Observer)
        IphoneCustomer iphoneCustomer = new IphoneCustomer();

        // العميل بيسجل اشتراكه في المتابعة
        store.addCustomer(iphoneCustomer);

        // تغير حالة المنتج (المنتج بقى متاح)
        System.out.println("Product is not available");
        store.setProductAvailability(false); // المنتج مش متاح

        System.out.println("Product is available");
        store.setProductAvailability(true); // المنتج متاح
    }
}