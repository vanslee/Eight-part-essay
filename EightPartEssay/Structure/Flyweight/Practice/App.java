package EightPartEssay.Structure.Flyweight.Practice;

public class App {
    public static void main(String[] args) {
        ChesspiceFactory.getChesspiece("黑").put(0, 0);
        ChesspiceFactory.getChesspiece("白").put(1, 2);
        ChesspiceFactory.getChesspiece("黑").put(2, 3);
        ChesspiceFactory.getChesspiece("白").put(3, 3);
        ChesspiceFactory.getChesspiece("黑").put(7, 10);
    }
}
