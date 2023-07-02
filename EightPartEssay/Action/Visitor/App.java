package EightPartEssay.Design.Visitor;

public class App {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.createElements();
        Visitor v = new ConcreteVisitor();
        objectStructure.action(v);

    }
}
