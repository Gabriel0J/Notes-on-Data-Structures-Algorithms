public class VariableArguments {
    //Math.min() that can take more than 2 arguments
    //Previously it would be something like (Math.min(Math.min(a,b),c))

    // '...' = ellipses
    public static void main(String[] args) {
        System.out.println(min(7));
        System.out.println(min(3,1));
        System.out.println(min(8,4,5,2,1,9,-3,6,1));
        System.out.println(min());
    }
    //you can only have 1 ellipses operator (as 'it' won't know when one ends and one begins)
    //if you still have other parameters, the one with ellipses goes at the end
    //if you choose not to put it at the end, the code will not compile
    public static int min(int... data) { //data is an array
        if (data.length == 0) {
            System.out.print("No Data - "); //throw new IllegalArgumentException();
            return 0;
        }
        int min = data[0];
        for (int value : data) {
            if (value < min) { //could be rewritten as  min = Math.min(min, value);
                min = value;
            }
        }
        return min;
    }
}
