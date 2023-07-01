package EightPartEssay.Creational.Factory.simplefactory;

public class ConcreteProduct implements Product {

    @Override
    public void getProductName() {
        System.out.println("name");
    }

    @Override
    public void getProductPrice() {
        System.out.println("price");
    }
}
