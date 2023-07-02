package EightPartEssay.Structure.Observe;

public class ConcreteObserver implements Observe {

    @Override
    public void update() {
        System.out.println(this + "观察到状态变化");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

}
