package EightPartEssay.Structure.Adapter;

public class App {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
