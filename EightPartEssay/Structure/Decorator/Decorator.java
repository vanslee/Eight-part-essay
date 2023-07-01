package EightPartEssay.Structure.Decorator;

public abstract class Decorator implements Component {
    private Component component = null;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        this.component.operation();
        // TODO Auto-generated method stub

    }

}
