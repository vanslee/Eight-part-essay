package EightPartEssay.Structure.Command.Practice;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class YellowCommand extends JButton implements MyCommand {

    private JPanel p;

    public YellowCommand(String name, JPanel p) {
        super(name);
        this.p = p;
    }

    @Override
    public void execute() {
        p.setBackground(Color.YELLOW);
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'execute'");
    }

}
