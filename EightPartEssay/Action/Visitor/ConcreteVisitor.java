package EightPartEssay.Design.Visitor;

public class ConcreteVisitor implements Visitor {

    @Override
    public void visit(ConcreteElement1 element1) {
        element1.operation();
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public void visit(ConcreteElement2 element2) {
        element2.operation();

        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

}
