public class TwoDay extends Package{
    
    private float flatFee;

    public TwoDay(Person sender, Person recipient, float weight, float costPerOunce, float flatFee) {
        super(sender, recipient, weight, costPerOunce);
        this.flatFee = flatFee;
    }

    public float calculateCost() {
        return super.calculateCost() + this.flatFee;
    }

    public float getFlatFee() {
        return this.flatFee;
    }

    public void setFlatFee(float flatFee) {
        this.flatFee = flatFee;
    }

}
