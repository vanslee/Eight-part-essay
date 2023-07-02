package EightPartEssay.Structure.Strategy.Practice;

public class FixDiscountStrategy extends DiscountStrategy {

    public FixDiscountStrategy(double price, int number) {
        super(price, number);
        // TODO Auto-generated constructor stub
    }

    @Override
    public double calculateDiscount() {
        return this.getPrice() * this.getNumber() * 1.2;
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'calculateDiscount'");
    }

}
