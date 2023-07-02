package EightPartEssay.Structure.ChainOfResponsibility;

public class Client {

    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler();
        Handler h2 = new ConcreteHandler();
        h1.setSuccessor(h2);
        h1.handleRequest();
    }
}
