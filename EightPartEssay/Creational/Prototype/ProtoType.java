package EightPartEssay.Creational.Prototype;

/**
 * 需要让抽象原型Prototype接口继承 Cloneable 接口，以标明该接口的实现类可以被复制，并声明一个 clone()方法
 */
public interface ProtoType extends Cloneable {
    // 克隆方法
    ProtoType clone();
}
