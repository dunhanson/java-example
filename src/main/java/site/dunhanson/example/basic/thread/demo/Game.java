package site.dunhanson.example.basic.thread.demo;

public class Game {

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