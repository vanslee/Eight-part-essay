package EightPartEssay.Structure.Iterator;

import java.util.Vector;

public class ConcreteAggregate<T> extends Aggregate<T> {
    private Vector<T> vector = new Vector<>();

    public T getElement(int index) {
        if (index < vector.size()) {
            return vector.get(index);
        } else {
            return null;
        }
    }

    @Override
    Iterator<T> createIterator() {
        return new ConcreteIterator<T>(this);
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'createIterator'");
    }

    @Override
    void add(T e) {
        this.vector.add(e);
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    public int size() {
        return vector.size();
    }

}
