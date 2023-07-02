package EightPartEssay.Structure.Command.Practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements ActionListener {
    private JPanel p;
    private YellowCommand btnYellowCommand;
    private RedCommand btnRedCommand;
    private ExitCommand btnExit;

    public MyFrame() {
        super("命令模式");
        p = new JPanel();
        this.add(p);
        btnYellowCommand = new YellowCommand("黄色", p);
        btnRedCommand = new RedCommand("红色", p);
        btnExit = new ExitCommand("退出");
        p.add(btnYellowCommand);
        p.add(btnRedCommand);
        p.add(btnExit);
        btnYellowCommand.addActionListener(this);
        btnRedCommand.addActionListener(this);
        btnExit.addActionListener(this);
        this.setSize(400, 300);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MyCommand obj = (MyCommand) e.getSource();
        obj.execute();
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
