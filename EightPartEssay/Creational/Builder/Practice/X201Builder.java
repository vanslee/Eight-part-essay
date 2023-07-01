package EightPartEssay.Creational.Builder.Practice;

public class X201Builder implements ComputerBuilder {
    private X201 computer = new X201();

    @Override
    public void buildCpu() {
        computer.setCpu("i3-350");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'buildCpu'");
    }

    @Override
    public void buildRam() {
        computer.setRam("2GB 1333MHz");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'buildRam'");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("250GB 5400转");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'buildHardDisk'");
    }

    @Override
    public void buildGraphicCard() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'buildGraphicCard'");
    }

    @Override
    public void buildOs() {
        computer.setOs("Windows7 Home版");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'buildOs'");
    }

    @Override
    public void buildMonitor() {
        computer.setMonitor("12英寸 1280＊800");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'buildMonitor'");
    }

    @Override
    public Computer getComputer() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'getComputer'");
        return computer;
    }

    @Override
    public void buildType() {
        computer.setType("X210");
        // TODO Auto-generated method stub

    }

}
