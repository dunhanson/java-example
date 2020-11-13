package site.dunhanson.example.basic.thread.test;

import site.dunhanson.example.basic.thread.game.GoalNotifier;

public class VolatileGameTest {

    /**
     * 答案已经很明确了，这里面有两个线程，main函数所在的是主线程和GoalNotifier线程，这两个线程都分别从主内存从拷贝了一个goal变量的副本
     * 所以当main函数调用setGoal()方法修改goal时，修改的其实是自己线程工作空间上的那个副本goal
     * 对主内存的goal没有影响，对GoalNotifier线程的goal副本更加没有影响，GoalNotifier线程自然就感知不到goal变成true了。
     */
    public static void main(String[] args) throws InterruptedException {
        // Game begun! Init goalNotifier thread
        GoalNotifier goalNotifier = new GoalNotifier();
        Thread goalNotifierThread = new Thread(goalNotifier);
        goalNotifierThread.start();

        // After 3s
        Thread.sleep(3000);
        // Goal !!!
        goalNotifier.setGoal(true);
    }

}