package EightPartEssay.Structure.Bridge.Practice;

public abstract class AbstrctShape {
    private Color color;

    public AbstrctShape(Color color) {
        this.color = color;
    }

    public Color color() {
        return color;
    }

    public void draw() {

    };

}
