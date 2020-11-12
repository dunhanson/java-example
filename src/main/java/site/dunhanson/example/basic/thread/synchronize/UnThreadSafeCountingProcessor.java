package site.dunhanson.example.basic.thread.synchronize;

public class UnThreadSafeCountingProcessor implements CountingProcessor{
    private long count = 0;

    @Override
    public void process() {
        doProcess();
        count++;
    }

    @Override
    public long getCount() {
        return count;
    }

    private void doProcess() {

    }
}
