package EightPartEssay.Structure.Command;

public class ConcreteCommand extends Commond {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    protected void execute() {
        receiver.action();
        // TODO Auto-generated method stub

    }

}
