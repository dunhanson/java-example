package site.dunhanson.example.basic.thread.process;

public class UnThreadSafeCountingProcessor implements CountingProcessor{
    private long count = 0;

    @Override
    public void process() {
        doProcess();
        /*synchronized (this) {
            count++;
        }*/
        count++;
    }

    @Override
    public long getCount() {
        return count;
    }

    private void doProcess() {

    }
}
