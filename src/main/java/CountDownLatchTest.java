import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
    private static CountDownLatch latch = new CountDownLatch(4);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                System.out.println("latch down");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                latch.countDown();

            }).start();
        }
        latch.await();
        System.out.println("latch await");
    }
}
