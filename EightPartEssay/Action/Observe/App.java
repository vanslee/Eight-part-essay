package EightPartEssay.Structure.Observe;

public class App {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observe obs1 = new ConcreteObserver();
        Observe obs2 = new ConcreteObserver();
        subject.attach(obs1);
        subject.attach(obs2);
        subject.change();
    }
}
