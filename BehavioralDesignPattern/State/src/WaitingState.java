// الحالة الأولى: في حالة انتظار
class WaitingState implements State {
    public void handleRequest(TicketMachine machine) {
        System.out.println("Machine is pending. Sale has been activated.");
        machine.setState(new SellingState());  // تغير الحالة لبيع التذاكر
    }
}
