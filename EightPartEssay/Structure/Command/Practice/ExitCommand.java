package EightPartEssay.Structure.Command.Practice;

import javax.swing.JButton;

public class ExitCommand extends JButton implements MyCommand {

    public ExitCommand(String name) {
        super(name);
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'execute'");
        System.exit(0);
    }

}
