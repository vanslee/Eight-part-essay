package EightPartEssay.Structure.Proxy.Practice;

public class GamePlayer implements IGamePlayer {
    private String name = "";

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'killBoss'");
    }

    @Override
    public void upGrade() {
        System.out.println(this.name + "成功升级");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'upGrade'");
    }

}
