package EightPartEssay.Structure.Proxy.Practice;

import java.util.Date;

public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer player = null;

    public GamePlayerProxy(IGamePlayer player) {
        this.player = player;
    }

    public void log() {
        System.out.println("打怪时间" + new Date().toString());
    }

    public void count() {
        System.out.println("升1级耗费50小时");
    }

    @Override
    public void killBoss() {
        this.log();
        player.killBoss();
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'killBoss'");
    }

    @Override
    public void upGrade() {
        player.upGrade();
        this.count();
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'upGrade'");
    }

}
