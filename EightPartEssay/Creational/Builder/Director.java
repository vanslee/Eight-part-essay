package EightPartEssay.Creational.Builder;

public class Director {
    private Builder builder = new ConcreteBuilder();

    public Product build(String part1, String part2, String part3) {
        builder.setPart1(part1);
        builder.setPart2(part2);
        builder.setPart3(part3);
        return builder.builderProduct();
    }
}
