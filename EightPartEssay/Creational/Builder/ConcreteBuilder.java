package EightPartEssay.Creational.Builder;

public class ConcreteBuilder extends Builder {
    private Product product = new Product();

    @Override
    public void setPart1(String body) {
        product.setCarBody(body);
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'setPart1'");
    }

    @Override
    public void setPart2(String part) {
        product.setCarBrand(part);
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'setPart2'");
    }

    @Override
    public void setPart3(String part) {
        product.setCarWheel(part);
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'setParte'");
    }

    @Override
    public Product builderProduct() {
        return product;
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'builderProduct'");
    }

}
