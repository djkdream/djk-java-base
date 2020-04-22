package com.djk.thread;

/**
 * @ClassName TheadMain
 * @Description 线程测试
 * @Author Administrator
 * @Date 2020/4/10 23:58
 * @Version 1.0
 */
public class TheadMain {

    public static void main(String[] args) {

        //final PersonLock person = new PersonLock() ;
        new Thread(){
            public void run(){
                try {
                    Thread.sleep(0);
                    PersonLock person = new PersonLock() ;
                    person.stringIntern("100");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread(){
            public void run(){
                try {
                    Thread.sleep(0);
                    PersonLock person = new PersonLock() ;
                    person.stringIntern("200");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
