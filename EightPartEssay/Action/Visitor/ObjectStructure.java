package EightPartEssay.Design.Visitor;

import java.util.Random;
import java.util.Vector;

public class ObjectStructure {
    private Vector<Element> elements = new Vector<>();

    public void add(Element e) {
        elements.add(e);
    }

    public void action(Visitor v) {
        for (Element element : elements) {
            element.accept(v);
        }
    }

    public void createElements() {
        Random rand = new Random();
        for (int index = 0; index < 10; index++) {
            if (rand.nextInt(100) > 50) {
                this.add(new ConcreteElement1());
            } else {
                this.add(new ConcreteElement2());
            }
        }
    }

}
