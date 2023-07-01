package EightPartEssay.Creational.Factory.abstractfactory;

public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public ProductA factoryA() {
        System.out.println("ConcreteFactory2生产的食物");
        return new ProductA1();
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'factoryA'");
    }

    @Override
    public ProductB factoryB() {
        System.out.println("ConcreteFactory2生产的玩具");
        return new ProductB1();
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'factoryB'");
    }

}
