package EightPartEssay.Creational.Factory.simplefactory;

public interface Creator {
    /**
     * 工厂方法
     * 创建一个产品对象,其输入参数类型可以自行设置
     * 
     * @param c
     * @param <T>
     * @return
     */
    public <T extends Product> T factory(Class<T> c);
}
