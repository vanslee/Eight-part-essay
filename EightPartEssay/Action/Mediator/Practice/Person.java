package EightPartEssay.Structure.Mediator.Practice;

public abstract class Person {
    public String name;
    public int age;
    public String sex;
    public MarriageAgency agency;
    public int requestAge;

    public Person(String name, int age, String sex, MarriageAgency agency, int requestAge) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.requestAge = requestAge;
        this.agency = agency;
        agency.register(this);
    }

    public void findParner() {
        agency.pair(this);
    }
}
