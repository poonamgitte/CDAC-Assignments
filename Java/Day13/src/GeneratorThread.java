import java.util.LinkedList;
import java.util.function.Supplier;

public class GeneratorThread implements Runnable {
    private final LinkedList<String> otpList;
    private final int totalOtps;

    public GeneratorThread(LinkedList<String> otpList, int totalOtps) {
        this.otpList = otpList;
        this.totalOtps = totalOtps;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < totalOtps; i++) {
                Supplier<String> otpGenerater = () -> {
                    String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                    int randomIndex = (int) (Math.random() * 26);
                    StringBuilder buffer = new StringBuilder(String.valueOf(alphabets.charAt(randomIndex)));
                    for (int j = 1; j < 5; j++) {
                        Integer otp = (int) (Math.random() * 9);
                        buffer.append(otp);
                    }
                    return buffer.toString();
                };

                String generatedOtp = otpGenerater.get();

                synchronized (otpList) {
                    // Wait as long as the list is not empty
                    while (!otpList.isEmpty()) {
                        otpList.wait();
                    }
                    otpList.add(generatedOtp);
                    synchronized (System.out) {
                        System.out.println("Generated Otp: " + generatedOtp);
                    }
                    otpList.notifyAll(); // Wake up any waiting consumers
                }

                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
