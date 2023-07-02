package EightPartEssay.Design.Visitor.Practice;

public class Cpu extends HardWare {

    public Cpu(String type) {
        super(type);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void run() {
        System.out.println("型号为" + type + "的cpu正在运转");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

    @Override
    public void accept(ComputerVisitor cv) {
        cv.visitCpu(this);
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'accept'");
    }

}
