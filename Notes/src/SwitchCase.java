public class SwitchCase {
    public static final String[] weekdays = {"MON", "TUE","WED","THU","FRI","SAT","SUN"};
    public static void main(String[] args) {
        int num = 3;
        switch (num) {
            case 1:
                System.out.println("odd");
                break;
            case 2:
                System.out.println("even");
                break;
            case 3:
                System.out.println("odd");
                break;
            case 4:
                System.out.println("even");
                break;
            default:
                System.out.println("number is unaccounted for");
                break;
        }
        /*
        String day = weekdays[4];
        switch (day) {
            case "MON":
                System.out.println("Welcome to a new week");
                break;
            case "TUE":
                System.out.println("Still early!");
                break;
            case "WED":
                System.out.println("It's hump day!");
                break;
            case "THU":
                System.out.println("It's almost over!");
                break;
            case "FRI":
                System.out.println("TGIF");
                break;
            case "SAT":
            case "SUN":
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("Unknown day encountered");
                break;
                //case statement can go in any order you want- default can go first
        }
         */
    }
}