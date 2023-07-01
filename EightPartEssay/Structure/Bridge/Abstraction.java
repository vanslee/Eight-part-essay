package EightPartEssay.Structure.Bridge;

public abstract class Abstraction {
    private Implementor implementor = null;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        this.implementor.operationImpl();
    }
}
