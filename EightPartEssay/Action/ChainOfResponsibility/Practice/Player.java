package EightPartEssay.Structure.ChainOfResponsibility.Practice;

import java.util.Objects;

public abstract class Player {
    private Player successor;

    public abstract void hanlder(int i);

    protected void setSuccessor(Player aSuccessor) {
        successor = aSuccessor;
    }

    public void next(int index) {
        if (!Objects.isNull(successor)) {
            successor.hanlder(index);
        } else {
            System.out.println("游戏结束");
        }
    }

    public Player getSuccessor() {
        return successor;
    }

}
