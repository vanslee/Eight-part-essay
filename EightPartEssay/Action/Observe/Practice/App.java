package EightPartEssay.Structure.Observe.Practice;

public class App {
    public static void main(String[] args) {
        Button btn = new Button();
        btn.addClickableObserve(new ChangeBtnColor());
        btn.addClickableObserve(new ChangeBtnPosition());
        btn.changeButton();
    }
}
