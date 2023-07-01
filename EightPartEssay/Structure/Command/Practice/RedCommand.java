package EightPartEssay.Structure.Command.Practice;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class RedCommand extends JButton implements MyCommand {
    private JPanel p;

    public RedCommand(String name, JPanel p) {
        super(name);
        this.p = p;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'execute'");
        p.setBackground(Color.RED);
    }

}
