public class Overnight extends Package{
    
    private float aditionalFee;

    public Overnight(Person sender, Person recipient, float weight, float costPerOunce, float aditionalFee) {
        super(sender, recipient, weight, costPerOunce);
        this.aditionalFee = aditionalFee;
    }

    public float calculateCost() {
        return (super.getCostPerOunce() + this.aditionalFee) * super.getWeight();
    }

    public float getAditionalFee() {
        return this.aditionalFee;
    }

    public void setAditionalFee(float aditionalFee) {
        this.aditionalFee = aditionalFee;
    }

}
