package EightPartEssay.Structure.Observe;

import java.util.Enumeration;
import java.util.Vector;

public class ConcreteSubject implements Subject {
    private Vector<Observe> obsVector = new Vector<Observe>();

    /**
     * 登记一个新的观察者
     * 
     * @param obs 新观察者
     */
    @Override
    public void attach(Observe obs) {
        obsVector.add(obs);
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'attach'");
    }

    /**
     * 删除一个观察者
     */
    public void detach(Observe obs) {
        obsVector.remove(obs);
    }

    /**
     * 通知所有的观察者对象
     */
    public void notifyObserver() {
        for (Observe e : obsVector) {
            e.update();
        }
    }

    /**
     * 返回集合中的Enumeration对象
     * 
     * @return
     */
    public Enumeration<Observe> observers() {
        return obsVector.elements();
    }

    /***
     * 改变状态，通知所有观察者
     */
    public void change() {
        this.notifyObserver();
    }

}
