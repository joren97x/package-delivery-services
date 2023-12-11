public class Package {

    private Person sender;
    private Person recipient;
    private float weight;
    private float costPerOunce;

    public Package(Person sender, Person recipient, float weight, float costPerOunce) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
        this.costPerOunce = costPerOunce;
    }

    public float calculateCost() {
        return this.weight * this.costPerOunce;
    }

    public Person getSender() {
        return this.sender;
    }

    public Person getRecipient() {
        return this.recipient;
    }

    public float getWeight() {
        return this.weight;
    }

    public float getCostPerOunce() {
        return this.costPerOunce;
    }

}
