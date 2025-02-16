// الحالة الثانية: في حالة بيع تذكرة
class SellingState implements State {
    public void handleRequest(TicketMachine machine) {
        System.out.println("The machine is in ticket selling state.");
        machine.setState(new StoppedState());  // تغير الحالة لإيقاف الآلة
    }
}

