package EightPartEssay.Design.Visitor.Practice;

public interface ComputerVisitor {
    void visitCpu(Cpu cpu);

    void visitHardDisk(HardDisk hardDisk);
}
