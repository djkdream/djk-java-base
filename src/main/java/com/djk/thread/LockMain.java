package djk.thread;

/**
 * @ClassName LockMain
 * @Description 锁
 * @Author Administrator
 * @Date 2020/4/12 12:22
 * @Version 1.0
 */
public class LockMain {

    public static void main(String[] args) {

        final PersonLock person = new PersonLock() ;
        new Thread(){
            public void run(){
                try {
                    Thread.sleep(2000);
                    //PersonSync person = new PersonSync() ;
                    person.write();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread(){
            public void run(){
                try {
                    Thread.sleep(0);
                    //PersonSync person = new PersonSync() ;
                    person.read();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
