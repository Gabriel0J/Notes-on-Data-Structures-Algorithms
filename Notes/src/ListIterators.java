import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterators {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Albert");
        names.add("Bob");
        names.add("Carol");
        names.add("David");
        names.add("Ed");
        ListIterator<String> it = names.listIterator();

        while (it.hasNext()) {
            System.out.println(it.next()); //prints forwards
        }

        while (it.hasPrevious()) {
            System.out.println(it.previous()); //prints backwards (the previous while loop has put the iterator at the end of the list)
        }

        System.out.println("-------");
        ListIterator<String> backit = names.listIterator(names.size()); //can parse backwards without needing to parse forwards
        //backit.next(); //NoSuchElementException
        while (backit.hasPrevious()) {
            System.out.println(backit.previous());
        }

        System.out.println("----------");
        //ListIterator<String> it = names.listIterator(2); sets the pointer to just before element 2, so that the value it.next() returns is Carol
        //  this is how we were able to parse backwards without needing to parse forwards first, as we simply set the pointer to just after the last
        //  element by giving it names.size() as its index parameter (if we called backit.next() we would get an error [NoSuchElementException])
        //it.remove() removes the last item ** accessed **
        //  note that if you don't access a value before calling the remove method, you will get an error
        //it.set(x) sets the last item accessed
        //it.add(x) adds a value after the pointer
        System.out.println(names);
        ListIterator<String> itrtr = names.listIterator(2);
        System.out.println(itrtr.next());
        itrtr.set("Name"); //Carol is set to Name
        itrtr.add("NewName"); //NewName is added just after index 2 (which is Carol, but has just been set to Name)
        System.out.println(names);
    }
}