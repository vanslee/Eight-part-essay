package EightPartEssay.Structure.ChainOfResponsibility;

public abstract class Handler {
    public Handler successor;

    public abstract void handleRequest();

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

}
