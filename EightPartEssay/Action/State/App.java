package EightPartEssay.Design.State;

public class App {
    public static void main(String[] args) {
        Context context = new Context();
        // ConcreteState2 concreteState2 = new ConcreteState2();
        // ConcreteState1 concreteState1 = new ConcreteState1();

        // context.setCurrentState(concreteState1);
        context.handle1();

        context.handle2();
    }
}
