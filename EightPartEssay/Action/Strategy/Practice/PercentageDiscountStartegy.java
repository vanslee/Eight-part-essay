package EightPartEssay.Structure.Strategy.Practice;

public class PercentageDiscountStartegy extends DiscountStrategy {

    public PercentageDiscountStartegy(double price, int number) {
        super(price, number);
        // TODO Auto-generated constructor stub
    }

    @Override
    public double calculateDiscount() {
        return this.getPrice() * this.getNumber() * 0.8;
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'calculateDiscount'");
    }

}
