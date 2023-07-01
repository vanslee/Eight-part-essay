package EightPartEssay.Structure.ChainOfResponsibility.Practice;

public class PlayerD extends Player {

    public PlayerD(Player successor) {
        this.setSuccessor(successor);
    }

    @Override
    public void hanlder(int i) {
        if (i == 4) {
            System.out.println("PlayerD喝酒！");
        } else {
            System.out.println("PlayerD把花传下去！");
            next(i);
        }
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'hanlder'");

    }

}
