package EightPartEssay.Structure.TemplateMethod;

public class App {
    public static void main(String[] args) {
        AbstractClass concreteClass = new ConcreteClass();
        concreteClass.operation();
    }
}
