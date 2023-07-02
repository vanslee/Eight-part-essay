package EightPartEssay.Design.State;

public abstract class State {
    protected Context context;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void handle();

}
