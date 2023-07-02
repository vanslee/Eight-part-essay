package EightPartEssay.Structure.ChainOfResponsibility.Practice;

public class DrumBeater {
    public static void main(String[] args) {
        PlayerA playerA = new PlayerA(new PlayerB(new PlayerC(new PlayerD(null))));
        playerA.hanlder(3);
    }

}
