package EightPartEssay.Structure.Composite.Practice;

public class Employee implements Company {
    // 叶子节点类
    private String name;// 姓名
    private String position;// 职位
    private int salary;// 薪水
    // 构造函数

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        String info = "";
        info = "名称：" + this.name;
        info = info + "\t职位：" + this.position;
        info = info + "\t薪水: " + this.salary;
        return info;
    }
}
