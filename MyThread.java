// This is using implement runnable interface

public class MyThread implements Runnable{
    public static void main(String[] args) {
      MyThread t = new MyThread();
      Thread t1  = new Thread(t);
     // AnotherThread t2 = new AnotherThread();
      t1.start();
      //t2.start();
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("The value of i is :"+(i+1));
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }

}

