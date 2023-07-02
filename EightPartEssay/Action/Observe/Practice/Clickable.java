package EightPartEssay.Structure.Observe.Practice;

public interface Clickable {
    void changeButton();

    void addClickableObserve(ClickableObserver obs);

    void removeClickableObserve(ClickableObserver obs);
}
