package EightPartEssay.Structure.ChainOfResponsibility.Practice;

public class PlayerC extends Player {

    public PlayerC(Player successor) {
        this.setSuccessor(successor);
    }

    @Override
    public void hanlder(int i) {
        if (i == 3) {
            System.out.println("PlayerC喝酒！");
        } else {
            System.out.println("PlayerC把花传下去！");
            next(i);
        }
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'hanlder'");

    }

}
