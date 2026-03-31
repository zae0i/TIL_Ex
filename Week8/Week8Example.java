public class Week8Example {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread: " + i);
                try { Thread.sleep(200); } catch (InterruptedException ignored) {}
            }
        });
        t.start();
        t.join();
        System.out.println("Main thread 종료");
    }
}
