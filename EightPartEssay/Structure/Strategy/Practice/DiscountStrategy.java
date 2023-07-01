package EightPartEssay.Structure.Strategy.Practice;

public abstract class DiscountStrategy {
    private double price;
    private int number;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public DiscountStrategy(double price, int number) {
        this.price = price;
        this.number = number;
    }

    public abstract double calculateDiscount();

}