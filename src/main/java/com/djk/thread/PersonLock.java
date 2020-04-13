package djk.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName Person
 * @Description 人
 * @Author Administrator
 * @Date 2020/4/10 23:56
 * @Version 1.0
 */
public class PersonLock {

    private ReentrantLock lock = new ReentrantLock() ;

    public void write() throws InterruptedException {
        lock.lock();
        System.out.println("write somethings start");
        System.out.println("write somethings sleep 10s");
        Thread.sleep(10000);
        System.out.println("write somethings end");
        lock.unlock();
    }

    public void read() throws InterruptedException {
        lock.lock();
        System.out.println("read somethings start");
        System.out.println("read somethings sleep 10s");
        Thread.sleep(10000);
        System.out.println("read somethings end");
        lock.unlock();
    }
}
