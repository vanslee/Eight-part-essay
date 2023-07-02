package EightPartEssay.Structure.Command;

public class Client {
    public static void main(String[] args) {
        // 调用者
        Invoker invoker = new Invoker();
        Receiver receiver = new Receiver();
        ConcreteCommand concreteCommand = new ConcreteCommand(receiver);
        invoker.setCommand(concreteCommand);
        invoker.action();
    }
}
