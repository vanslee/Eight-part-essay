package EightPartEssay.Creational.Prototype;

public class ConcretePrototype implements ProtoType {

    @Override
    public ProtoType clone() {
        // TODO Auto-generated method stub
        // return super.clone();
        try {
            return (ProtoType) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
