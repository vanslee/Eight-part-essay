package EightPartEssay.Structure.Memento;

public abstract class Client {
    public static void main(String[] args) {
        Originator o = new Originator();
        Caretaker car = new Caretaker();
        car.setMemento(o.createMementor());
        o.restoreMemento(car.getMemento());

    }

}
