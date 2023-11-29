package Multi_Threading_And_Simultaneity;

public class MyThread extends Thread {
    public void run() {
        System.out.println("Inside other thread");
        while (true) {
            System.out.println("Looping Inside other thread");
            try {
                Thread.sleep(500);
                //the thread asks the scheduler to put it to sleep for 500 milliseconds
            } catch (Exception e) {}
        }
    }
    //this is a rare way of making threads, since most of the time you're already
    //extending from another class
}
