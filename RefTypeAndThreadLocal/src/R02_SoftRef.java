import java.lang.ref.SoftReference;

public class R02_SoftRef {
    public static void main(String[] args) {
        /**
         * -Xms20M -Xmx20M
         */
        SoftReference<byte[]> softRef = new SoftReference<>(new byte[1024 * 1024 * 10]);
        System.out.println(softRef.get());
        SoftReference<byte[]> softRef1 = new SoftReference<>(new byte[1024 * 1024 * 10]);
        //如果堆内存不设置成20M,那么softRef1和softRef内存地址就是一样的,设置之后softRef就为空了
        System.out.println(softRef.get());
    }
}


