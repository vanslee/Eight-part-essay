package EightPartEssay.Creational.Builder.Practice;

public class T410 extends Computer {
    public String graphicCard;

    @Override
    public String toString() {
        return "型号：\t" + this.getType() + "\nCPU：\t" + this.getCpu()
                + "\n内存：\t" + this.getRam() + "\n硬盘：\t" + this.getHardDisk()
                + "\n显卡：\t" + this.getGraphicCard() + "\n显示器：\t"
                + this.getMonitor() + "\n操作系统：" + this.getOs();
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }
}
