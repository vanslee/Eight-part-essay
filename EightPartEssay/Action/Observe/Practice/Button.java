package EightPartEssay.Structure.Observe.Practice;

import java.util.Vector;

public class Button implements Clickable {
    private Vector<ClickableObserver> vectos = new Vector<>(7);

    @Override
    public void changeButton() {
        System.out.println("按钮被点击");
        for (ClickableObserver vectos : vectos) {
            vectos.change(this);
        }
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'click'");
    }

    @Override
    public void addClickableObserve(ClickableObserver obs) {
        vectos.add(obs);
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'addClickableObserve'");
    }

    @Override
    public void removeClickableObserve(ClickableObserver obs) {
        vectos.remove(obs);
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'removeClickableObserve'");
    }

}
