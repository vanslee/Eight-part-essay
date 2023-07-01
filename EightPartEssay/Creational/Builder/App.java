package EightPartEssay.Creational.Builder;

public class App {
    public static void main(String[] args) {
        Director director = new Director();
        Product build = director.build("抹茶绿车衣", "比亚迪", "米其林轮胎");
        System.out.println(build);
    }
}
