// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //System.out.print("Hello world");
        //tcgenerator(-4,3,3); //taxi cab generator
        //ternary();
        //System.out.print(foo());
        char_();
    }
    //taxi cab
    public static void tcgenerator(int x, int y , int d) {
        for(int i = -d; i < d; i++) {
            System.out.println( (x+i) + ", " + (y - d + Math.abs(i)) );
        }
        for(int i = d; i > -d; i--) {
            System.out.println( (x+i) + ", " + (y + d - Math.abs(i)) );
        }
    }
    //ternary operator and char (9/11/23)
    //      quiz on ternary operator & char (9/13/23)
    public static void ternary() {
        int n = 3;
        int m = 5;
        int p = 7;
        //n = (p < 5)? 7 : m;
        //System.out.println("n = " + n);

        //example of nested ternary
        //package 1h; #########
        //public class TernaryOperator { ##############
        //int a = 5, b = 6, c = 7;
        ////applying nested ternary operator
        //int n = (a<=b)? ( (a<=c) ? a : c ) : ( (b <= c) ? b : c );
        //} ################
    }
    public static boolean foo() {
        int x = 5;
        //return (x>5)? false : true;
        return(x>5);
    }

    public static void char_() {
        char c = 'w';
        String s = "abc";
        s.charAt(0); //returns 'a' NOT "a" (two different data structures)
        //char is much closer to an integer than it is a String
        int[] data = new int[256];
        data[3] = 7;
        data['a'] = 5;
        //'a' has an ascii value of 97

        char n = 'a';
        int number = 122;
        System.out.println((char)number);
        System.out.println(n + "");
        System.out.println(n);
    }
}