package EightPartEssay.Structure.Strategy.Practice;

public class Context {
    private DiscountStrategy ds;

    public Context(DiscountStrategy ds) {
        this.ds = ds;
    }

    public double contextCalDisc() {
        return ds.calculateDiscount();
    }

    public static void main(String[] args) {

        Context context0 = new Context(new NoDiscountStrategy(48.5, 20));
        System.out.println("0折扣：" + context0.contextCalDisc());
        Context contextFix = new Context(new FixDiscountStrategy(46, 60));
        System.out.println("固定折扣：" + contextFix.contextCalDisc());
        Context contextPer = new Context(new PercentageDiscountStartegy(38, 40));
        System.out.println("15%的折扣：" + contextPer.contextCalDisc());
    }

}
