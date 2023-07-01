package EightPartEssay.Structure.Mediator.Practice;

import java.util.ArrayList;
import java.util.List;

public class MarriageAgencyLmpl implements MarriageAgency {
    List<Man> mans = new ArrayList<>();
    List<Woman> women = new ArrayList<>();

    @Override
    public void pair(Person person) {
        if (person.sex == "男") {
            for (Woman woman : women) {
                if (woman.age == person.requestAge) {
                    System.out.println(person.name + "和" + woman.name + "配对成功");
                    return;
                }
            }
        } else {
            for (Man man : mans) {
                if (man.age == person.requestAge) {
                    System.out.println(person.name + "和" + man.name + "配对");
                    return;
                }
            }
        }
        System.out.println("没有为" + person.name + "找到合适的对象");
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'pair'");
    }

    @Override
    public void register(Person person) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'register'");
        if (person instanceof Man) {
            mans.add((Man) person);
        } else {
            women.add((Woman) person);
        }
    }
}
