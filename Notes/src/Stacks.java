import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        int[] myList = {1,2,3,4,5,6,7,8,9,10};
        printList(myList);
        flipList(myList);
        printList(myList);
        //------------------------------------
        Stack<String> s = new Stack<>();
        s.push("Bob");
        s.push("Carol");
        s.push("Mary");
        System.out.println(s); //stack is part of the collections interface (like ArrayLists), meaning that it knows how to print itself
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        //Will print: "Mary" "Mary" "Carol" "Bob" "Bob"
        //Adding an additional "System.out.println(s.pop());" will give an EmptyStackException
    }
    public static void flipList(int[] list) {
        Stack<Integer> stack = new Stack<>();
        for (int num : list) {
            stack.push(num);
        }
        for (int i = 0; i < list.length; i++) {
            list[i] = stack.pop();
        }
    }
    public static void printList(int[] list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
