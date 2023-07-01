package EightPartEssay.Structure.Decorator.Proxy;

public class CarConcreteDecorator extends CarDecornator {

    public CarConcreteDecorator(Car r) {
        super(r);
    }

    private void print() {
        System.out.println("在车尾绘制 新手 字样,颜色是紫色霞光");
    }

    private void setGps() {
        System.out.println("安装GPS定位导航系统");
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        super.show();
        this.print();
        this.setGps();
    }

}
