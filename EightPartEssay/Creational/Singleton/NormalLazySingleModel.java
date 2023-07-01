package EightPartEssay.Creational.Singleton;

public class NormalLazySingleModel {
    private static NormalLazySingleModel m_instance = null;

    // 构造方法私有，保证外界无法直接实例化
    private NormalLazySingleModel() {
    }

    // 通过改方法获得实例对象
    private static NormalLazySingleModel newInstance() {
        if (m_instance == null) {
            m_instance = new NormalLazySingleModel();
        }
        return m_instance;
    }

    public static void main(String[] args) {
        int threadCount = 1000;
        Thread[] threads = new Thread[threadCount];
        for (int i = 0; i < threadCount; i++) {
            // final int threadIndex = i;
            threads[i] = new Thread(() -> {
                // System.out.println("Thread " + threadIndex + " started.");
                System.out.println(NormalLazySingleModel.newInstance());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // System.out.println("Thread " + threadIndex + " completed.");
            });
            threads[i].start();
        }

    }
}
