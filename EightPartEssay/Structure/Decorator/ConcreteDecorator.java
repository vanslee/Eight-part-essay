package EightPartEssay.Structure.Decorator;

public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
        // TODO Auto-generated constructor stub
    }

    private void method() {
        System.out.println("被修饰了");
    }

    @Override
    public void operation() {
        this.method();
        // TODO Auto-generated method stub
        super.operation();
    }

}
