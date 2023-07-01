package EightPartEssay.Structure.Flyweight.Practice;

public class ChesspieceFlyWeight implements Chesspiece {
    private String color;

    public ChesspieceFlyWeight(String color) {
        this.color = color;
    }

    @Override
    public void put(int x, int y) {
        System.out.println(color + "子," + "放在了(" + x + "," + y + ")的位置");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'put'");
    }

}
