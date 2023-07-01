package EightPartEssay.Structure.Flyweight;

public class ConcreteFlyWeight implements FlyWeight {
    private String intrinsicState;

    public ConcreteFlyWeight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("内部状态：" + intrinsicState);
        System.out.println("外部状态: " + extrinsicState);
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'operation'");
    }

}
