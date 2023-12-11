public class Pointers {
    //Pointers are the single most important concept to learn before leaving this class
    //ListNode or Node:
    //  contains a single item of data, and a pointer that points to another node
    //  the pointer at the end points to null (or back to the front in some cases)

    //ArrayLists and LinkedLists both implement the list interface

    //Advantages of nodes: easier to insert new vales, as you can just change some pointers rather than moving every value after it
    //Disadvantages of nodes: not as fast as arrayList (arraylists have random access, linked lists have sequential access)

    //ArrayList memory- bus full of people (values) - good
    //LinkedList memory- traffic jam (values) - bad

    //You should write List<> list = new (arraylist or linked list) //it allows you to change your mind instead of being restricted to using
    //just arrayList methods or just linkedList methods

    //12/8/23 ------------

    //Variables are like a box
    //Compiler sees primitives as variable names with values at an address (memory location)
    //Addresses / pointers are normally in hexadecimal, but here we're using smaller numbers to better understand
    //Java doesn't support "raw pointers," much harder to get the memory location of a variable
    //Compilers sees object variables differently:
        //the pointer to the object is held at one location [address location "2" named d holds a value]
        //the value of the pointer points to another memory location, which holds object data [the value held at location 2, "7", is an address to the object data]
        //[address "7" may hold an age, "8" may hold gpa, etc]
}