public class Singletons {
    private static Singletons single_instance = null;
    public String s;
    private Singletons() {
        s = "Hello I am a String";
    }
    //constructor is private, if people want to access this class they must call the
    //getInstance method

    public static Singletons getInstance() {
        if (single_instance == null) {
            single_instance = new Singletons();
        }
        return single_instance;
    }
    //Singletons are useful for writing classes like messageLoggers
}
