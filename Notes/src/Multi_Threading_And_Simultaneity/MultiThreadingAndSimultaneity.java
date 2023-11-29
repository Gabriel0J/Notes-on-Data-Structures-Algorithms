package Multi_Threading_And_Simultaneity;

public class MultiThreadingAndSimultaneity { //"Main"
    public static void main(String[] args) {
        System.out.println("Inside the main thread");
        MyThread t1 = new MyThread();
        t1.start();
        //Thread supplies the start method, you supply the run method
        /*while (true) {
            System.out.println("Looping inside the main thread");
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }*/
        //##this is a rare way of making threads, since most of the time you're already
        //##extending from another class

        //you can implement from the runnable interface as an alternative
        Runnable r = new Runnable() {
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
        };
        Thread t2 = new Thread(r);
        t2.start();
        //threads are subservient to the scheduler- if it asks to be put to sleep to 500
        //milliseconds,it might end up being asleep for longer

        //you're giving up control to the scheduler- if you want precise timings, you shouldn't
        //have used threads

        //Homework: watch both videos about Multi-Threading on westhillcs

        //Quiz friday- make two classes run at the same time using threads
        //quiz will be on threads within the same cpu
        //(seems like simultaneity but it actually isn't, just being performed while switching very fast)
        //splitting threads between multiple cpus will come at the end of the year
    }
}