package EightPartEssay.Creational.Factory.factorymethods;

import java.lang.reflect.InvocationTargetException;

public class AppleGardener implements FruitGardener {

    @Override
    public Fruit factory() {
        return new Apple();
    }

}
