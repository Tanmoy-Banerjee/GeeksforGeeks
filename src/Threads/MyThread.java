package Threads;
//creating thread using runnable interface
public class MyThread implements Runnable{

    public void run(){
        for(int i= 1; i<=10; i++){
            System.out.println("Value of I is "+i);
            try {
                   Thread.sleep(1000);
                System.out.println("sleeping");
            }catch (Exception e){

            }
        }

    }


    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        Thread t = new Thread(myThread);

        t.start();

        MyAnotherThread t1 = new MyAnotherThread();
        t1.start();
    }
}
