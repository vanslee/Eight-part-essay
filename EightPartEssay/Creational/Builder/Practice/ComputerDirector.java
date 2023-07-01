package EightPartEssay.Creational.Builder.Practice;

public class ComputerDirector {
    ComputerBuilder builder;

    public T410 constructT410() {
        T410Builder t410Builder = new T410Builder();
        t410Builder.buildType();
        t410Builder.buildCpu();
        t410Builder.buildGraphicCard();
        t410Builder.buildHardDisk();
        t410Builder.buildMonitor();
        t410Builder.buildRam();
        t410Builder.buildOs();
        return (T410) t410Builder.getComputer();
    }

    public X201 constructX210() {
        X201Builder X210Builder = new X201Builder();
        X210Builder.buildType();
        X210Builder.buildCpu();
        X210Builder.buildHardDisk();
        X210Builder.buildMonitor();
        X210Builder.buildRam();
        X210Builder.buildOs();
        return (X201) X210Builder.getComputer();
    }

}
