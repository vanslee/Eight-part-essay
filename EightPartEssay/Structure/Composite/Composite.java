package EightPartEssay.Structure.Composite;

import java.util.ArrayList;

public class Composite implements Component {
    private ArrayList<Component> componentList = new ArrayList<Component>();

    public void add(Component component) {
        this.componentList.add(component);
    }

    public void remove(Component component) {
        this.componentList.remove(component);
    }

    public ArrayList<Component> getChild() {
        return this.componentList;
    }

    @Override
    public void operation() {
        System.out.println("树枝");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'operation'");
    }

}
