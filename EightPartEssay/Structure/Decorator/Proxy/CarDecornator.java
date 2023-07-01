package EightPartEssay.Structure.Decorator.Proxy;

public abstract class CarDecornator implements Car {
    private Car car = null;

    public CarDecornator(Car r) {
        this.car = r;
    }

    @Override
    public void show() {
        this.car.show();
        // TODO Auto-generated method stub

    }

}
