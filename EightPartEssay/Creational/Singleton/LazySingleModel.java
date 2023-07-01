package EightPartEssay.Creational.Singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LazySingleModel {
    private LazySingleModel() {
        if (m_instance != null) {
            throw new IllegalStateException("Already initialized");
        }

    }

    private static volatile LazySingleModel m_instance = null;

    synchronized public static LazySingleModel newInstance() {
        if (m_instance == null) {
            synchronized (LazySingleModel.class) {
                if (m_instance == null) {
                    synchronized (LazySingleModel.class) {
                        m_instance = new LazySingleModel();
                    }
                }
            }
        }
        return m_instance;
    }

    public static void main(String[] args) {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        List<Callable<String>> tasks = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            tasks.add(new MyRunnable());
        }
        try {
            newCachedThreadPool.invokeAll(tasks);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    static class MyRunnable implements Callable<String> {

        @Override
        public String call() throws Exception {
            // TODO Auto-generated method stub
            System.out.println(LazySingleModel.newInstance());
            return "success";
        }
    }
}
