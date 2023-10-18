public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("ABC");
        s.reverse(); //you don't need s = s.reverse() because string builders are mutable
        System.out.println(s);
        System.out.println(s.capacity()); //starts off at 16, added 3 chars -> 19

        StringBuilder a = new StringBuilder(100); //starts off with capacity of 100
        //the compiler has set aside 100 bites for this specific variable
        //helpful if you know the size of the string beforehand
        //if it exceeds, StringBuilder will copy over the new string
        //initialize a's capacity as 5
        //a.append("ABCDEFG");
        //System.out.println(a);

        s.reverse();
        System.out.println(s);
        s.append("DEF");
        System.out.println(s);
        System.out.println(s.length());
        //prints the length of the string that you've created, not the capacity
        System.out.println(s.capacity());
        s.trimToSize();
        System.out.println(s.capacity());
        //trimToSize if helpful for when you know that your string won't get any longer,
        //so you can free up the extra capacity you know you won't be using

        String t = s.toString(); // converts StringBuilder to string
        System.out.println(t);
    }
}