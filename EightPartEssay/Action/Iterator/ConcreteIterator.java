package EightPartEssay.Structure.Iterator;

public class ConcreteIterator<T> implements Iterator<T> {
    private ConcreteAggregate<T> agg;
    private int index;
    private int size;

    public ConcreteIterator(ConcreteAggregate<T> agg) {
        this.agg = agg;
        size = agg.size();
        index = 0;
    }

    @Override
    public T next() {
        if (hasNext()) {
            return agg.getElement(index++);
        } else {
            return null;
        }
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'next'");
    }

    @Override
    public boolean hasNext() {
        return index < size;
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'hasNext'");
    }

}
