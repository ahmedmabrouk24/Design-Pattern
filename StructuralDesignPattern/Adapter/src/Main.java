public class Main {
    public static void main(String[] args) {
        // بنشئ كائن من الخدمة الجديدة
        NewSMSService newSMSService = new NewSMSService();
        
        // لو حاولنا استخدام الخدمة الجديدة بشكل مباشر في الكود القديم ده هيعمل مشكلة
        // newSMSService.sendSMS("0123456789", "Hello, this is an SMS!"); 
        // لأنه مفيش طريقة sendSMS في NewSMSService هنا هنواجه مشكله
        
        // دلوقتي بننشئ الـ Adapter اللي هيربط الخدمة القديمة بالجديدة
        SMSAdapter smsAdapter = new SMSAdapter(newSMSService);

        // هنستخدم الـ Adapter علشان نبعث رسالة بالطريقة القديمة
        smsAdapter.sendSMS("0123456789", "Hello, this is an SMS!");

        // دلوقتي بنقدر نبعث رسالة بنفس الكود القديم ولكن بنستخدم الخدمة الجديدة!
    }
}