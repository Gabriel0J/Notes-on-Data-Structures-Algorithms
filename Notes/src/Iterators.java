import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators {
    //Iterators can go through anything that uses the Collections interface
    public static void main(String[] args) {
        //Ways to parse an arrayList:
        List<String> names = new ArrayList<>();
        //list is on the left because list is an interface, and allows us to come back and
        //assign this variable to be some other type of list in the future
        names.add("Albert");
        names.add("Bob");
        names.add("Carol");
        names.add("David");
        names.add("Ed");
        System.out.println(names);

        for (String name : names) {
            System.out.print(name + " ");
        }//for each loops cant edit the lists, iterators have the same restrictions

        System.out.println();

        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }//"brute force" method of iterating

        System.out.println();

        //Iterating with Iterators
        //They are very powerful but can blow up in your face
        //Iterators work with all collections
        Iterator<String> it = names.iterator();
        //System.out.println(it.next());
        //notice that you are calling the iterator method on an existing data structure
        //you are asking names to give you its iterator
        while (it.hasNext()) { //always check for hasNext, otherwise the iterator will give you a runtime error
            System.out.print(it.next() + " ");
            //names.add("name"); // ConcurrentModificationException
            //it.remove(); //removes the last accessed item- 2 lines above here it.next() accesses an item, this item is the focus of the remove method
            //should it be called
        }
        System.out.println();
        //System.out.println(names);

        //ConcurrentModificationException - when you mess with the data structure in the middle of iterating
        //iterator gives you a special command - it.remove() - notice that you are calling the method on the iterator
        // (this is so the iterator knows what's going on)
        //it.remove() removes the current item [that being the last accessed item]

        //List iterators can do a lot more: move forward & backwards, edit the list beyond remove, but only on Lists - more next class
        //Quiz Next Class On Stacks
    }
}
