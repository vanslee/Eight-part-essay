package EightPartEssay.Creational.Factory.abstractfactory;

public class App {
    public static void main(String[] args) {
        ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();
        ConcreteFactory2 concreteFactory2 = new ConcreteFactory2();
        concreteFactory1.factoryA().foodsName();
        concreteFactory1.factoryA().foodsPrice();
        concreteFactory1.factoryB().toolsName();
        concreteFactory1.factoryB().toolsPrice();
        concreteFactory2.factoryA().foodsName();
        concreteFactory2.factoryA().foodsPrice();
        concreteFactory2.factoryB().toolsName();
        concreteFactory2.factoryB().toolsPrice();

    }
}
