class SMSAdapter {
    private NewSMSService newSMSService;

    public SMSAdapter(NewSMSService newSMSService) {
        this.newSMSService = newSMSService;
    }

    // هنا بنحول الطريقة من service الجديدة للطريقة القديمة
    public void sendSMS(String phoneNumber, String message) {
        newSMSService.sendTextMessage(phoneNumber, message); // بنستخدم الطريقة الجديدة هنا
    }
}