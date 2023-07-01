package EightPartEssay.Creational.Builder.Practice;

public class T410Builder implements ComputerBuilder {
    private T410 t410 = new T410();

    @Override
    public void buildCpu() {
        t410.setCpu("i5-450");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'buildCpu'");
    }

    @Override
    public void buildRam() {
        t410.setRam("4GB 1333MHz");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'buildRam'");
    }

    @Override
    public void buildHardDisk() {
        t410.setHardDisk("500GB 7200转");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'buildHardDisk'");
    }

    @Override
    public void buildGraphicCard() {
        t410.setGraphicCard("Navida NVS 3100M");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'buildGraphicCard'");
    }

    @Override
    public void buildOs() {
        t410.setOs("Windows 7 旗舰版");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'buildOs'");
    }

    @Override
    public void buildMonitor() {
        t410.setMonitor("14英寸 1280*800");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'buildMonitor'");
    }

    @Override
    public Computer getComputer() {
        // TODO Auto-generated method stub
        return t410;
        // throw new UnsupportedOperationException("Unimplemented method
        // 'getComputer'");
    }

    @Override
    public void buildType() {
        t410.setType("T410");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'buildType'");
    }

}
