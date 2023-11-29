import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    //Sets differentiate from lists because they don't have indexes (no order) and don't store duplicate values
    //Best way to remove duplicates from a list is to convert it to a set and then back to a list
    //  tradeoff is that you lose the order of the values
    //Two types of sets: HashSet( .contains() = O(1) ) & TreeSet ( .contains() = O(log n) )
    //  "Hashing is the single best idea people have come up with in computer science"

    //# TreeSet #
    //Internally stores values using a binary search tree, returns values in natural order (smallest to largest)
    //if the values don't have a natural order (like a dog), the class needs to implement the comparable interface and override the compareTo method

    //HashSets just give you whatever
    //If you need to know the index, you shouldn't be using sets
    //union = "or" - all values between 2 sets (no duplicates)
    //intersection = "and" - all values that 2 sets share
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<Integer>(); //set is an interface, TreeSet is a concrete class
        set1.add(7);
        set1.add(8);
        set1.add(4);
        set1.add(0);
        set1.add(-2);
        set1.add(9);
        System.out.println(set1); //sets can print themselves

        Set<Integer> set2 = new HashSet<Integer>();
        set2.add(7);
        set2.add(8);
        set2.add(5);
        set2.add(11);
        set2.add(-2);
        set2.add(4);

        //parse using for-each
        for (Integer num : set1) {
            System.out.println(num);
        }

        System.out.println("----");
        //parse using iterator
        Iterator<Integer> it = set1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //TreeSet will print out from smallest to largest, HashSet will print in whatever order

        System.out.println("----");
        Set<Integer> setUnion = new TreeSet<>();
        setUnion.addAll(set1); //makes a copy
        setUnion.addAll(set2); //makes a union operation - all values in set1 & set2
        //it's a bad idea to edit data in computer science- good practice is to copy the data and work on the copy, that way you can look back
        //at the original if need be

        for (Integer num : setUnion) { //sets know how to print themselves, so you can just use System.out.println(setUnion);
            System.out.print(num + " ");
        }
        System.out.println();

        Set<Integer> setIntersection = new TreeSet<>();
        setIntersection.addAll(set1);
        setIntersection.retainAll(set2); //intersection

        for (Integer num : setIntersection) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}