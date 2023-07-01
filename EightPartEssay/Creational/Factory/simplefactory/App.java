package EightPartEssay.Creational.Factory.simplefactory;

public class App {
    public static void main(String[] args) {
        ConcreteCreator concreteCreator = new ConcreteCreator();
        Product product = concreteCreator.factory(ConcreteProduct.class);
        product.getProductPrice();
        product.getProductName();
    }

}
