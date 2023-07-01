package EightPartEssay.Structure.Proxy;

public class ProxySubject implements Subject {
    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        this.beforeRequest();
        subject.request();
        this.afterRequest();
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'request'");
    }

    public void beforeRequest() {
        System.out.println("beforeRequest");
    }

    public void afterRequest() {
        System.out.println("afterRequest");
    }

}
