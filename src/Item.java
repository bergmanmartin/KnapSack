public class Item {
    private int weight;
    private int value;
    private double utility;

    public Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
            this.utility = ((double)value /(double)weight);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double getUtility() {
        return utility;
    }

    public void setUtility(double utility) {
        this.utility = utility;
    }

    public Item createNewItem() {
        return new Item(value,weight);
    }
}
