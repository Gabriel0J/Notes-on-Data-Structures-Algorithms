public class Enums {
    //9/19/23
    //Making a pointer 'Dog d', means that d can point to Dogs
    //If Dog has child classes 'a' and 'b', d can point to those as well
    //(is-a relationship)
    //There is one type of pointer that can point to anything - 'Obj p'
    //Why don't we use this pointer for everything?
    //  You might not want this pointer to point to anything - compiler will help make sure
    //  you're not accidentally setting the pointer to something you don't want

    //Enums
    //String[] dayOfWeek = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    //String d = "Frog";
    //Enums further restrict variables
    // (prevent someone accidentally put String d into String[] dayOfWeek)
    //Enums are the single most important topic out of the 'Leftover Java Topics'
    //##### new way to make dayOfWeek vvv #####
    enum DayOfWeek {MON, TUE, WED, THU, FRI, SAT, SUN}; //similar to a new data type
    //enum is like a scaled down version of a class
    //enums should be capitalized

    enum Flavors {PEPPERONI, PINEAPPLE, MUSHROOMS}; //good idea to have them capitalized because they are constants

    enum RetiredYankees {
        BABERUTH(3),
        LOUGEHRIG(4),
        BILLYMARTIN(1),
        BERNIEWILLIAMS(51);
        private int jerseyNumber;
        private RetiredYankees(int num) {
            jerseyNumber = num;
        }
        public int getNum() {
            return jerseyNumber;
        }
    }; //ordinal values 0-3
    //we want to assign another number to each player- their jersey number
    //think of BABERUTH(3) as like a constructor call


    public static void main(String[] args) {
        //Yankee();

        DayOfWeek a = DayOfWeek.MON;
        System.out.println(a);
        switch (a) {
            case MON:
            case TUE:
            case WED:
            case THU:
            case FRI:
                System.out.println("Weekday");
                break;
            case SAT:
            case SUN:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Unrecognized value in enunm");
                break;
        }
        System.out.println();
        //You can iterate through enums like arrays:
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
            System.out.println(day.ordinal()); //gives each value a number (MON - 0, TUE - 1, etc.) | refers to position in enum
            //ordinal: 0,1,2,3
            //cardinal: 1,2,3,4
        }
    }

    public static void Yankee() {
        RetiredYankees y = RetiredYankees.BERNIEWILLIAMS;
        System.out.println(y.getNum());
        System.out.println(RetiredYankees.BABERUTH.getNum());
    }

}