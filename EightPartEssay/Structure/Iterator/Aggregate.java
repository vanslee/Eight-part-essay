package EightPartEssay.Structure.Iterator;

public abstract class Aggregate<T> {
    abstract Iterator<T> createIterator();

    abstract void add(T e);
}
