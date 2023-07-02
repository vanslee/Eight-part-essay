package EightPartEssay.Design.Visitor.Practice;

public class RunVisitor implements ComputerVisitor {

    @Override
    public void visitCpu(Cpu cpu) {
        cpu.run();
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'visitCpu'");
    }

    @Override
    public void visitHardDisk(HardDisk hardDisk) {
        hardDisk.run();
        // hardDisk.accept(this);
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'visitHardDisk'");
    }

}
