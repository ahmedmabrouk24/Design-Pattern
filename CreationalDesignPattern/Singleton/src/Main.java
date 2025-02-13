public class Main {
    public static void main(String[] args) {
        // كل مرة هتستخدم الكود ده هترجع نفس الكائن من DatabaseConnection
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        DatabaseConnection connection2 = DatabaseConnection.getInstance();
        
        // هتلاقي إن الكائنين دول هما نفس الكائن
        System.out.println(connection1 == connection2);  // هيرجع true
    }
}
