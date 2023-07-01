package EightPartEssay.Structure.Strategy;

public class Context {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // @Override
    // public void strategyInterface() {
    // // TODO Auto-generated method stub
    // // throw new UnsupportedOperationException("Unimplemented method
    // // 'strategyInterface'");
    // }

    public void contextInterface() {
        this.strategy.strategyInterface();
    }

}
