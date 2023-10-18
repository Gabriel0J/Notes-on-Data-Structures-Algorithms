package AnonymousInnerClasses_and_ComparableObjects;//package Comparable Objects & AIC;
import AnonymousInnerClasses_and_ComparableObjects.Cat;

import java.util.Arrays;
import java.util.Comparator;

public class CatTester {
    public static void main(String[] args) {
        Cat[] litter = {
                new Cat("Morris", 9),
                new Cat("Felix", 4),
                new Cat("Garfield", 11)
        };
        // ^^ these are anonymous objects, as they don't have variable names

        Cat a = new Cat("Fifi",4); //this is not an anonymous object

        //How do we sort the cats?
        Arrays.sort(litter);

        for (Cat c : litter) {
            System.out.println(c);
        }

        //Anonymous Inner Class
        Cat c = new Cat() {
            @Override public String toString() {
                return "Name: " + getName() + "\nAge: " + getLives();
            }
        }; //<<new class that reuses the cat code, and changes we want will be put within
        //the brackets
        c.setName("Frisky");
        c.setLives(10);
        System.out.println();
        System.out.println(c);
        System.out.println();

        Comparator<Cat> comp = new Comparator<Cat>() { //comparable object
            @Override public int compare(Cat c1, Cat c2) {
                return c1.getLives() - c2.getLives(); //alt way to compare cats by lives
            }
        }; //you can have multiple comparators, and use whichever whenever you may need
        Arrays.sort(litter,comp); //you can tell how you want objects to be compared
        for(Cat cat : litter) {
            System.out.println(cat);
        }

        //quiz next class- know aic syntax, overriding compare method inside aic
    }
}
