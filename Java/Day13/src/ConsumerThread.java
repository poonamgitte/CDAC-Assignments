import java.util.LinkedList;

public class ConsumerThread implements Runnable {
    private final LinkedList<String> otpList;
    private final int totalOtps;

    public ConsumerThread(LinkedList<String> otpList, int totalOtps) {
        this.otpList = otpList;
        this.totalOtps = totalOtps;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < totalOtps; i++) {
                String otp;
                synchronized (otpList) {
                    // Wait as long as the list is empty
                    while (otpList.isEmpty()) {
                        otpList.wait();
                    }
                    otp = otpList.removeFirst();
                    synchronized (System.out) {
                        System.out.println("Consumed Otp: " + otp);
                    }
                    otpList.notifyAll(); // Wake up any waiting producers
                }
                Thread.sleep(20);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
