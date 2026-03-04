import java.util.LinkedList;

public class OtpEntry {
    public static void main(String[] args) throws InterruptedException {
        LinkedList<String> otpList = new LinkedList<>();
        int totalOtps = 10;

        GeneratorThread generateOtp = new GeneratorThread(otpList, totalOtps);
        Thread generateThread = new Thread(generateOtp);

        ConsumerThread consumeOtp = new ConsumerThread(otpList, totalOtps);
        Thread consumeThread = new Thread(consumeOtp);

        System.out.println("Starting threads...");
        generateThread.start();
        consumeThread.start();

        generateThread.join();
        consumeThread.join();
        System.out.println("All OTPs generated and consumed.");
    }
}
