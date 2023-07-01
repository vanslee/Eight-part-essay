package EightPartEssay.Creational.Factory.simplefactory;

import java.lang.reflect.InvocationTargetException;

public class ConcreteCreator implements Creator {
    @Override
    public <T extends Product> T factory(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | InvocationTargetException | InstantiationException | IllegalAccessException
                | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        return (T) product;
    }
}
