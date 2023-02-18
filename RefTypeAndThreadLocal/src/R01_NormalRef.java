public class R01_NormalRef {
    /**
     * -Xms20M -Xmx20M 堆内存分配20M
     *
     * @param args
     */
    public static void main(String[] args) {
        M d1 = new M();
        System.out.println(d1);
//        d1 = null;
        M d2 = new M();
        System.out.println(d1);
//        System.out.println(d2);
    }
}

class M {
    private byte[] temp = new byte[1024 * 1024 * 10]; // 10M
}
