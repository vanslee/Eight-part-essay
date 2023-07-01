package EightPartEssay.Structure.Flyweight.Practice;

public abstract class ChesspiceFactory implements Chesspiece {
    private static final ChesspieceFlyWeight BLACK_CHESS = new ChesspieceFlyWeight("黑");
    private static final ChesspieceFlyWeight WHITE_CHESS = new ChesspieceFlyWeight("白");

    public static ChesspieceFlyWeight getChesspiece(String color) {
        if ("黑".equals(color)) {
            return BLACK_CHESS;
        } else {
            return WHITE_CHESS;
        }

    }

}
