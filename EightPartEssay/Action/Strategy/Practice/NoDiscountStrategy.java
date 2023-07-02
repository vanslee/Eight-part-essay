package EightPartEssay.Structure.Strategy.Practice;

public class NoDiscountStrategy extends DiscountStrategy {

    public NoDiscountStrategy(double price, int number) {
        super(price, number);
        // this.price = price;
        // this.number = number;
    }

    @Override
    public double calculateDiscount() {
        return this.getPrice() * this.getNumber();
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'calculateDiscount'");
    }

}
