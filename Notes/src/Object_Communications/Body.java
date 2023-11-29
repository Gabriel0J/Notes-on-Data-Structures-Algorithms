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
        //left lung & right lung cannot be included in each others constructors,
        //as it would require the lungs to already exist to create each other.
        //instead, we add an initializeOtherLung method so that we can add the lungs when
        //they're created
        //The only problem with this is that the user may not be aware that this method exists,
        //which can cause problems if they want 2 lungs that can communicate with each other
    }
    public void senseDanger() {
        System.out.println("Sensing danger!");
        myHeart.beatFaster();//10
    }
    public void sweat() {
        System.out.println("I am sweating!");
    }
}