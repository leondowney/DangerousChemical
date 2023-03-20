package com.qfedu.entity;

/**
 * @author Leon Downey
 * @date 2023/3/12 09:40
 * @describe： 人员搜索条件实体类
 */
public class PersonCondition {

    private String name;
    private String num;
    private String company;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public PersonCondition(String name, String num, String company) {
        this.name = name;
        this.num = num;
        this.company = company;
    }

    public PersonCondition() {
    }

    @Override
    public String toString() {
        return "PersonCondition{" +
                "name='" + name + '\'' +
                ", num='" + num + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
