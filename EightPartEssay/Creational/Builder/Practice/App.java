package EightPartEssay.Creational.Builder.Practice;

public class App {
    public static void main(String[] args) {
        ComputerDirector computerDirector = new ComputerDirector();
        T410 constructT410 = computerDirector.constructT410();
        System.out.println(constructT410);
        System.out.println("========================================");
        X201 constructX210 = computerDirector.constructX210();
        System.out.println(constructX210);
    }
}
