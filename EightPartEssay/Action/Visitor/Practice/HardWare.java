package EightPartEssay.Design.Visitor.Practice;

public abstract class HardWare {
    String type;

    public HardWare(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract void run();

    public abstract void accept(ComputerVisitor cv);
}
