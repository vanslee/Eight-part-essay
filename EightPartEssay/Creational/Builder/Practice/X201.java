package EightPartEssay.Creational.Builder.Practice;

public class X201 extends Computer {
    @Override
    public String toString() {
        return "型号：\t" + this.getType() + "\nCPU：\t" + this.getCpu()
                + "\n内存：\t" + this.getRam() + "\n硬盘：\t" + this.getHardDisk()
                + "\n显示器：\t" + this.getMonitor() + "\n操作系统：" + this.getOs();
    }
}
