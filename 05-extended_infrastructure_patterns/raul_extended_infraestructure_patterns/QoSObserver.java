
package middleware.raul_extended_infraestructure_patterns;

/**
 *
 * @author seuraul
 */
public class QoSObserver implements IQoSObserver {
    long start, done, executionTime;
    int inokationsCount, messageSize;
    
    @Override
    public void callStarted(){
        this.start = System.currentTimeMillis();
    }
    
    @Override
    public void callFinished(){
        this.done = System.currentTimeMillis();
        executionTime(this.start, this.done);
    }

    private void executionTime(long start, long done) {
        this.executionTime = done - start;
        this.done = this.start = 0;
    }
}
