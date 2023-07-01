package EightPartEssay.Structure.Proxy.Practice;

public class ClientDemo {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("李逍遥");
        GamePlayerProxy gamePlayerProxy = new GamePlayerProxy(player);
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upGrade();
    }
}
