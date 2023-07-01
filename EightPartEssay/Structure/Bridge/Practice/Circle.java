package EightPartEssay.Structure.Bridge.Practice;

public class Circle extends AbstrctShape {

    public Circle(Color color) {
        super(color);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void draw() {
        System.out.println("使用" + this.color().getColor() + "画圆形");
    }

}
