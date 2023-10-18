import java.io.File;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    //Access modifiers
    private String name; //private is the access modifier
    private int age; //private is the access modifier
    public double weight; //public is the access modifier

    //other access modifiers are 'default' and 'protected'
    //int x (default access modifier - not written)
    //protected int y (protected access modifier)

    //you might want to make a helper method private
    //it's ok to make final variables public, as they can't be changed
    //most data are private
    //default should be used sparingly

    //packages
    //when writing code you usually want to make a package
    //a much better name for 'package' is 'project'
    //package p1;
    //important because the access modifiers you can use depends on the package

    //quiz next class on Switch, Access Modifiers and StringBuilder (9/13/23)
    // [*15, not 13, this was written on the 13th]
    //memorize:
    //public - no restrictions
    //private - same class
    //protected - children of class or same package
    //default - same package
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    //deconstruct word list
    /*
    File f = new File("Word List");
        try {
        Scanner scan = new Scanner(f);
        while (scan.hasNext()) {
            String[] tokens = scan.nextLine().split(", ");
            for (String s : tokens) {
                System.out.println(s);
            }
        }
    } catch (Exception e) {
        System.exit(1);
    }
     */
}