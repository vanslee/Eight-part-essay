package EightPartEssay.Structure.ChainOfResponsibility.Practice;

public class PlayerA extends Player {

    public PlayerA(Player successor) {
        this.setSuccessor(successor);
    }

    @Override
    public void hanlder(int i) {
        if (i == 1) {
            System.out.println("playerA喝酒！");
        } else {
            System.out.println("playerA把花传下去！");
            next(i);
        }
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'hanlder'");

    }

}
