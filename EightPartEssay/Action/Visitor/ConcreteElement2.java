package EightPartEssay.Design.Visitor;

public class ConcreteElement2 extends Element {

    @Override
    public void accept(Visitor v) {
        v.visit(this);
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'accept'");
    }

    public void operation() {
        System.out.println("正在访问元素2");
    }

}
