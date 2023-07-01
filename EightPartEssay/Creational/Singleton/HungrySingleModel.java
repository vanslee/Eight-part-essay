package EightPartEssay.Creational.Singleton;

/**
 *
 */
// 饿汉式单例类更符合Java语言本身的特点。
public class HungrySingleModel {
    public static HungrySingleModel m_instance = new HungrySingleModel();

    private HungrySingleModel() {
    }

    public static HungrySingleModel getInstance() {
        return m_instance;
    }

    public static void main(String[] args) {

    }
}
