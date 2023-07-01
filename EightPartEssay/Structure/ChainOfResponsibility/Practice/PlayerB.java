package EightPartEssay.Structure.ChainOfResponsibility.Practice;

public class PlayerB extends Player {

    public PlayerB(Player successor) {
        this.setSuccessor(successor);
    }

    @Override
    public void hanlder(int i) {
        if (i == 2) {
            System.out.println("PlayerB喝酒！");
        } else {
            System.out.println("PlayerB把花传下去！");
            next(i);
        }
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'hanlder'");

    }

}