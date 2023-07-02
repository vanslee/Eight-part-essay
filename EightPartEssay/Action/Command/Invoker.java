package EightPartEssay.Structure.Command;

public class Invoker {
    private Commond commond;

    public void setCommand(Commond commond) {
        this.commond = commond;
    }

    public void action() {
        commond.execute();
    }

}
