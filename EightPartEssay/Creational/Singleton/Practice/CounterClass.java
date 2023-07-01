package EightPartEssay.Creational.Singleton.Practice;

public class CounterClass {
    private static int counter = 0;
    private static volatile CounterClass m_instance;

    private CounterClass() {
    }

    public synchronized int increase() {
        return counter++;
    }

    public synchronized static CounterClass newInstance() {
        synchronized (CounterClass.class) {
            if (m_instance == null) {
                synchronized (CounterClass.class) {
                    m_instance = new CounterClass();
                }
            }
            return m_instance;
        }
    }

    public static void main(String[] args) {
        MyThread n1 = new MyThread();
        MyThread n2 = new MyThread();
        MyThread n3 = new MyThread();
        n1.start();
        n2.start();
        n3.start();
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            CounterClass counterClass = CounterClass.newInstance();
            for (int i = 0; i < 5; i++) {
                System.out.printf("%s线程第%d次访问", this.getName(), counterClass.increase());
                System.out.println();
            }
        }
    }
}
