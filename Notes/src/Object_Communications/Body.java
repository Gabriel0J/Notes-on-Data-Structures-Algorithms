package Object_Communications;

public class Body {
    private Heart myHeart; //body has a 'handle' to it's heart
    //a handle gives you access to a class
    private Lung leftLung;
    private Lung rightLung;
    public Body() {
        this.myHeart = new Heart(this);
        this.leftLung = new Lung(this);
        this.rightLung = new Lung(this);
        this.leftLung.initializeOtherLung(this.rightLung);
        this.rightLung.initializeOtherLung(this.leftLung);
    }
    public void senseDanger() {
        System.out.println("Sensing danger!");
        myHeart.beatFaster();//10
    }
    public void sweat() {
        System.out.println("I am sweating!");
    }
}