package site.dunhanson.example.basic.thread.synchronize;

public class SynchronizeProcessTest {
    public static final int LOOP_TIME = 100 * 100 * 1000;


    public static void main(String[] args) {
        CountingProcessor countingProcessor = new UnThreadSafeCountingProcessor();
        runTask(countingProcessor);
    }

    private static void runTask(CountingProcessor processor) {
        Thread thread1 = new Thread(new ProcessTask(processor, LOOP_TIME), "thread-1");
        Thread thread2 = new Thread(new ProcessTask(processor, LOOP_TIME), "thread-2");

        thread1.start();
        thread2.start();

        while (thread1.isAlive() || thread2.isAlive()) {

        }
    }
}
