package EightPartEssay.Structure.Decorator;

public class Client {
    public static void main(String[] args) {
        Component component = new ConcreateComponent();
        // 进行装饰
        component = new ConcreteDecorator(component);
        component.operation();
    }
}
