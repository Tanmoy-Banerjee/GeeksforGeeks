package Threads;


class UserThread extends Thread{
    @Override
    public void run() {
        System.out.println("THis is user defined thread");
    }
}
public class ThreadOperations {


    public static void main(String[] args) throws InterruptedException {
        System.out.println("program started");
        int x = 56+34;
        System.out.println("Sum is = "+x);

        Thread t = Thread.currentThread();
        String tName = t.getName();
        System.out.println("Current runnning thread is = "+ tName);
        t.setName("My Main");
         tName = t.getName();
        System.out.println("Current runnning thread is = "+ tName);
        Thread.sleep(5000);
        UserThread userThread = new UserThread();
        userThread.start();
        System.out.println(t.getId());
        System.out.println("Program ended....");
    }

}