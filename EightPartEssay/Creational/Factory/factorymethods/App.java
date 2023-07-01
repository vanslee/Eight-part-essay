package EightPartEssay.Creational.Factory.factorymethods;

public class App {
    public static void main(String[] args) {
        AppleGardener appleGardener = new AppleGardener();
        GrapeGardener grapeGardener = new GrapeGardener();
        appleGardener.factory().getFruitName();
        appleGardener.factory().getFruitPrice();
        grapeGardener.factory().getFruitName();
        grapeGardener.factory().getFruitPrice();

    }
}
