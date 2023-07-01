package EightPartEssay.Structure.Proxy;

public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("真实对象");
        // 业务逻辑处理
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'request'");
    }

}
