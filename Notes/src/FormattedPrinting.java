public class FormattedPrinting {
    public static void main (String[] args) {
        // System.out.println("a = " + a + " b = " + b);
        // Usually formatting stings is like this ^^

        double p = 12.345;
        System.out.println(p);
        System.out.printf("p=%.2f", p); // f stands for float

        System.out.println();
        int n = 12345;
        System.out.printf("n = %0,8d", n); // d stands for integer

        System.out.println();

        String s = "ABCDEF";
        System.out.printf("s = %20s", s); // s stands for string

    }
}
