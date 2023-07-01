package EightPartEssay.Creational.Prototype;

public class Client {
    public void operation(ProtoType example) {
        // 得到exmaple的脚本
        ProtoType clone = example.clone();
        System.out.println(clone);
    }
}
