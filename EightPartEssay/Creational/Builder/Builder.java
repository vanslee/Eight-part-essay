package EightPartEssay.Creational.Builder;

public abstract class Builder {
    // 设置产品不同部分,以获得不同的产品
    public abstract void setPart1(String part);

    public abstract void setPart2(String part);

    public abstract void setPart3(String part);
    // 构建产品

    public abstract Product builderProduct();

}
