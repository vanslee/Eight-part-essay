package EightPartEssay.Structure.Bridge;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }

    public void operation() {
        System.out.println("修正");
    }

}
