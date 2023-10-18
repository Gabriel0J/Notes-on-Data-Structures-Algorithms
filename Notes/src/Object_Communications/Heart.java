package Object_Communications;

public class Heart {
    private Body owner;
    private int rate;//my heartrate
    private static final int DANGER_RATE = 30;
    public static final int RESTING_RATE = 70;
    public Heart(Body owner) {
        this.owner = owner;
        this.rate = RESTING_RATE;
    }

    /*public void beatFaster(int increaseby) {
        this.rate += increaseby;
    }*/
    public void beatFaster() {
        this.rate += DANGER_RATE;
        System.out.println("My heart is beating at a faster rate: " + this.rate);
        owner.sweat();
    }
}