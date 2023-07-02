package EightPartEssay.Structure.Mediator;

public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void action() {
        System.out.println("这是同事1的行动方法！");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'action'");
    }

}
