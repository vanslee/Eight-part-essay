package EightPartEssay.Structure.Composite.Practice;

import java.util.ArrayList;

public class ConcreteCompany implements Company {
    private ArrayList<Company> companyList = new ArrayList<>();
    private String name;// 姓名
    private String position;// 职位
    private int salary;// 薪水

    public ConcreteCompany(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void add(Company company) {
        this.companyList.add(company);
    }

    public void remove(Company company) {
        this.companyList.remove(company);
    }

    public ArrayList<Company> getChild() {
        return this.companyList;
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
