package EightPartEssay.Creational.Factory.factorymethods;

import java.lang.reflect.InvocationTargetException;

public class GrapeGardener implements FruitGardener {

    @Override
    public Fruit factory() {
        return new Grape();
    }

}
