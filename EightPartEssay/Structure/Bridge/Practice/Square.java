package EightPartEssay.Structure.Bridge.Practice;

public class Square extends AbstrctShape {

    public Square(Color color) {
        super(color);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void draw() {
        System.out.println("使用" + this.color().getColor() + "画方形");
        // TODO Auto-generated method stub
        // super.draw();
    }

}
