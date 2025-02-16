public class Main {
    public static void main(String[] args) {
        TicketMachine machine = new TicketMachine(); // إنشاء آلة بيع التذاكر

        // المحاكاة: الآلة بتبدأ في حالة انتظار
        machine.request();  // Machine is pending. Sale has been activated.
        
        // الآلة بتتحول لحالة بيع التذاكر
        machine.request();  // The machine is in ticket selling state.

        // الآلة بتتحول لحالة إيقاف
        machine.request();  // اThe machine is stopped.

        // الآلة بتتحول تاني لحالة انتظار
        machine.request();  // Machine is pending. Sale has been activated.
    }
}