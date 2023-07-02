package EightPartEssay.Design.Visitor.Practice;

public class App {
    public static void main(String[] args) {
        Cpu cpu = new Cpu("AMD-5800H");
        HardDisk hardDisk = new HardDisk("西数蓝盘");
        ComputerVisitor cv = new RunVisitor();
        cv.visitCpu(cpu);
        cv.visitHardDisk(hardDisk);
        ComputerVisitor cv1 = new TypeVisitor();
        cv1.visitCpu(cpu);
        cv1.visitHardDisk(hardDisk);

    }
}
