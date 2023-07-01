package EightPartEssay.Structure.Bridge.Practice;

public class App {
    public static void main(String[] args) {
        Color red = new Red();
        Color green = new Green();
        AbstrctShape shape1 = new Circle(red);
        AbstrctShape shape2 = new Square(green);
        shape1.draw();
        shape2.draw();

    }
}
