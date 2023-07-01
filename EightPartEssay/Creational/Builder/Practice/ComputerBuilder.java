package EightPartEssay.Creational.Builder.Practice;

public interface ComputerBuilder {
    void buildType();

    void buildCpu();

    void buildRam();

    void buildHardDisk();

    void buildGraphicCard();

    void buildOs();

    void buildMonitor();

    Computer getComputer();
}
