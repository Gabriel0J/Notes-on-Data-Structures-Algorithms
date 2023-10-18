public interface Interfaces {
    //usually interfaces don't have much code, but they do have 'default methods' [advanced topic]
    //interfaces usually have these 'method stubs' vvv
    void m1();
    void m2();
    void m3();
    //not a good idea to add access modifiers - public by default
    //private would mean no other classes would even be able to implement the method

    //3 types of interfaces:
    //  1> normal interface (2 or more abstract methods)
    //  2> marker interface: zero abstract methods declared (handy, but not often used)
    //  3> SAM interface: Single Abstract Method (used extensively in data structures)
    //      now known as a 'functional interface'
    //      helpful because 1 method means you know exactly what you need to implement (no confusion)
}
