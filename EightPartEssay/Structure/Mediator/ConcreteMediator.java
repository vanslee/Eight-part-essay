package EightPartEssay.Structure.Mediator;

public class ConcreteMediator extends Mediator {
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void createConcreteMdiator() {
        colleague1 = new ConcreteColleague1(this);
        colleague2 = new ConcreteColleague2(this);
    }

    public ConcreteColleague1 getColleague1() {
        return colleague1;
    }

    public ConcreteColleague2 getColleague2() {
        return colleague2;
    }

    @Override
    public void colleagueChanged(Colleague colleague) {
        colleague1.action();
        colleague2.action();
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'colleagueChanged'");
    }

}
