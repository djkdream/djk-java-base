package djk.thread;

/**
 * @ClassName Person
 * @Description 人
 * @Author Administrator
 * @Date 2020/4/10 23:56
 * @Version 1.0
 */
public class PersonSync {

    public synchronized void write() throws InterruptedException {
        System.out.println("write somethings start");
        System.out.println("write somethings sleep 10s");
        Thread.sleep(10000);
        System.out.println("write somethings end");
    }

    public synchronized void read() throws InterruptedException {
        System.out.println("read somethings start");
        System.out.println("read somethings sleep 10s");
        Thread.sleep(10000);
        System.out.println("read somethings end");
    }
}
