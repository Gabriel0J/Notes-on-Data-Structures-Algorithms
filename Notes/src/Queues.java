import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    //Queue is an interface- you cant make objects with it
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); //LinkedList inherits the Queue interface
        //queue methods include:
        // .add(x) //adds x to the end of the queue, returns true if x was added or throws an error if it couldn't
        // .offer(x) //works just like add(), but guards against adding a value to a full queue, returning a boolean saying if x could be added or not
        // .remove() //gets the value at the front of the list
        // .poll() // works just like remove(), but guards against an empty queue by returning null
        //      System.out.println(q.poll());
        // .peek() //looks at the value at the front of the list without removing it

        //Quiz on queues next class - 11/20/23 - cancelled!
    }
}
