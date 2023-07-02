package EightPartEssay.Structure.Memento;

public class Originator {
    private String state = "";

    public Memento createMementor() {
        return new Memento(this.state);

    }

    public void restoreMemento(Memento m) {
        this.setState(m.getState());
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
