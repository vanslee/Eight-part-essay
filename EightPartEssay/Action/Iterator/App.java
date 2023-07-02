package EightPartEssay.Structure.Iterator;

public class App {
    public static void main(String[] args) {
        ConcreteAggregate<Integer> ca = new ConcreteAggregate<Integer>();
        ca.add(1);
        ca.add(2);
        ca.add(3);
        ca.add(4);
        Iterator<Integer> iterable = new ConcreteIterator<>(ca);
        while (iterable.hasNext()) {
            System.out.println(iterable.next());
        }

    }
}
