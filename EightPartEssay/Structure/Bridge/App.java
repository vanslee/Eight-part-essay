package EightPartEssay.Structure.Bridge;

public class App {

    public static void main(String[] args) {
        // 定义一个实现化角色
        Implementor impl = new ConcreteImplementor();
        // 定义一个抽象化角色
        Abstraction abs = new RefinedAbstraction(impl);
        abs.operation();
        impl.operationImpl();
    }

}
