package EightPartEssay.Design.State.Practice;

public class TV {
    private Channel channel;
    CCTV1 cctv1 = new CCTV1();
    CCTV2 cctv2 = new CCTV2();
    CCTV3 cctv3 = new CCTV3();

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public void disCCTV1() {
        this.setChannel(cctv1);
        channel.display();
    }

    public void disCCTV2() {
        this.setChannel(cctv2);
        channel.display();
    }

    public void disCCTV3() {
        this.setChannel(cctv3);
        channel.display();
    }
}
