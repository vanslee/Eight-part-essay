package EightPartEssay.Structure.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
    private static Map<String, FlyWeight> pool = new HashMap<String, FlyWeight>();

    private FlyWeightFactory() {
    } // 私有构造方法

    public static FlyWeight getFlyWeight(String intrinsicState) {
        FlyWeight FlyWeight = pool.get(intrinsicState);
        if (FlyWeight == null) {
            FlyWeight = new ConcreteFlyWeight(intrinsicState);
            pool.put(intrinsicState, FlyWeight);
        }
        return FlyWeight;
    }
}