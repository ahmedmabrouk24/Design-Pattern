public class DatabaseConnection {

    // الكائن الواحد الخاص بالكلاس
    private static DatabaseConnection instance;

    // الـ constractor الخاص بالكلاس
    private DatabaseConnection() {
        // هنا ممكن تضيف الكود اللي بيعمل الاتصال بقاعدة البيانات
        System.out.println("Connecting to database...");
    }

    //  دي هترجع الكائن الوحيد
    public static DatabaseConnection getInstance() {
        // لو الكائن لسه لم يتم إنشاؤه، هتنشئه
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
