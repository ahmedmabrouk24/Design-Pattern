// الحالة الثالثة: في حالة إيقاف
class StoppedState implements State {
    public void handleRequest(TicketMachine machine) {
        System.out.println("The machine is stopped.");
        machine.setState(new WaitingState());  // تغير الحالة للانتظار
    }
}