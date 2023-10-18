public class Args {
    public static void main(String[] args) {
        //ALT+SHIFT+F10, RIGHT, E, ENTER , TAB, enter command parameters, ENTER
        //^^^ How to enter args into the main method
        //mainly helpful for people using Linux
        for (String arg : args) {
            System.out.println(arg);
        }
        //args [
        //a
        //b
        //input.txt
        //c
        //d
        //output.txt]
    }
}
