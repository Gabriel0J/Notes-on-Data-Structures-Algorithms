package Abstract_Base_Classes;

public abstract class AbstractBaseClasses { //<-- abstract keyword         //ABC
    //an Abstract_Base_Classes.AbstractBaseClasses object cannot be made, but the class can be inherited from it
    //children of this class can still be created
    //methods can be abstract- this means that if you inherit from the class, you have to
    //  define the abstract method
    //  you should put @Override in front to tell the reader that the method is from another class

    //Abstract classes get tricky when
    public abstract void m();
    //m is abstract, you cant have m in this class- abstract means "it doesn't exist here"
    //if a class extends ABC, it needs to define m
}