package EightPartEssay.Structure.ChainOfResponsibility;

public class ConcreteHandler extends Handler {

    @Override
    public void handleRequest() {
        if (getSuccessor() != null) {
            System.out.println("请求传递给" + getSuccessor());
            getSuccessor().handleRequest();
        } else {
            System.out.println("请求处理");
        }
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'handleRequest'");
    }

}
