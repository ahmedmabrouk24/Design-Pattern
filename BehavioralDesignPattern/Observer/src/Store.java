import java.util.ArrayList;
import java.util.List;

// الكلاس الخاص بالـ Publisher (المخزن)
public class Store {
    private List<Customer> customers = new ArrayList<>(); // لستة العملاء المشتركين
    private boolean isProductAvailable = false; // الحالة الأولية للمنتج

    // طريقة للاشتراك في المتابعة
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // طريقة لإلغاء الاشتراك
    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    // طريقة لتغيير حالة المنتج
    public void setProductAvailability(boolean availability) {
        this.isProductAvailable = availability;
        notifyCustomers(); // لو المنتج متاح، نبعت إشعار لكل العملاء
    }

    // إشعار العملاء بأي تحديث في حالة المنتج
    private void notifyCustomers() {
        for (Customer customer : customers) {
            customer.update(isProductAvailable); // بنرسل لهم التحديث
        }
    }
}
