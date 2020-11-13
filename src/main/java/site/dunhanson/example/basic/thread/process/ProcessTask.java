package site.dunhanson.example.basic.thread.process;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProcessTask implements Runnable{
    private CountingProcessor countingProcessor;
    private long loopTime;

    public ProcessTask(CountingProcessor countingProcessor, long loopTime) {
        this.countingProcessor = countingProcessor;
        this.loopTime = loopTime;
    }

    @Override
    public void run() {
        int i = 0;
        while (i < loopTime) {
            countingProcessor.process();
            i++;
            log.info("Finally, the count is {}", countingProcessor.getCount());
        }
    }
}
