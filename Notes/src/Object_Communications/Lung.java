package Object_Communications;

public class Lung {
    private Body owner;
    private Lung other;
    public Lung(Body owner) {
        this.owner = owner;
    }
    public void initializeOtherLung(Lung other) {
        this.other = other;
    }
}
