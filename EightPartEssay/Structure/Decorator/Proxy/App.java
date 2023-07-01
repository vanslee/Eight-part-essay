package EightPartEssay.Structure.Decorator.Proxy;

public class App {
    public static void main(String[] args) {
        Benz benz = new Benz();
        CarConcreteDecorator carConcreteDecorator = new CarConcreteDecorator(benz);
        carConcreteDecorator.show();
    }
}
