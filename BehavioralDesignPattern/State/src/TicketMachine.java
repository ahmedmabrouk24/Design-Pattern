// فئة الآلة نفسها اللي بتدير الحالات
class TicketMachine {
    private State currentState;  // الحالة الحالية

    public TicketMachine() {
        // البداية تكون في حالة انتظار
        currentState = new WaitingState();
    }

    public void setState(State state) {
        currentState = state;  // تغيير الحالة
    }

    public void request() {
        currentState.handleRequest(this);  // تنفيذ السلوك على حسب الحالة الحالية
    }
}

