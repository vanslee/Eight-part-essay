package EightPartEssay.Structure.Flyweight;

public class App {
    public static void main(String[] args) {
        FlyWeight flyWeight = FlyWeightFactory.getFlyWeight("内部状态1");
        FlyWeight flyWeight1 = FlyWeightFactory.getFlyWeight("内部状态2");
        flyWeight.operation("外部状态1");
        System.out.println(flyWeight);
        flyWeight.operation("外部状态2");
        System.out.println(flyWeight);

        flyWeight1.operation("外部状态1");
        System.out.println(flyWeight1);
        flyWeight1.operation("外部状态2");
        System.out.println(flyWeight1);

    }
}