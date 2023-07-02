package EightPartEssay.Design.Visitor.Practice;

public class HardDisk extends HardWare {

    public HardDisk(String type) {
        super(type);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void run() {
        System.out.println("型号为" + type + "的硬盘正在运转");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

    @Override
    public void accept(ComputerVisitor cv) {
        cv.visitHardDisk(this);
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'accept'");
    }

}
