package Abstract_Base_Classes;

public abstract class AbstractBCHelper1 extends AbstractBaseClasses { //BCH1
    public void m() {

    }
    //m doesn't need to be here, as BCH1 is abstract, meaning it can get away with not having it [and pass down the required method to BCH2]
    //if m is here, it doesn't need to be defined in ABH2, as ABH2 inherits the method
}
