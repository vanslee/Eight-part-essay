package EightPartEssay.Design.Visitor.Practice;

public class TypeVisitor implements ComputerVisitor {

    @Override
    public void visitCpu(Cpu cpu) {
        System.out.println("cpu型号：" + cpu.getType());
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'visitCpu'");
    }

    @Override
    public void visitHardDisk(HardDisk hardDisk) {
        System.out.println("硬盘型号：" + hardDisk.getType());
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'visitHardDisk'");
    }

}
