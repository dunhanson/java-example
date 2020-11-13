package site.dunhanson.example.basic.thread.test;

import site.dunhanson.example.basic.thread.process.CountingProcessor;
import site.dunhanson.example.basic.thread.process.ProcessTask;
import site.dunhanson.example.basic.thread.process.UnThreadSafeCountingProcessor;

public class SynchronizeProcessTest {
    public static final int LOOP_TIME = 100 * 100 * 1000;

    /**
     * ynchronize
     * 如何向一个新手介绍synchronized的表象？
     * Java语言的关键字，当它用来修饰一个方法或者一个代码块的时候，能够保证在同一时刻最多只有一个线程执行该段代码。
     *
     * 如何在一个老司机面前装逼格？
     * Java中的synchronize，通过使用内置锁
     * 来实现对变量的同步操作，进而实现了对变量操作的原子性和其他线程对变量的可见性，从而确保了并发情况下的线程安全。
     */
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
