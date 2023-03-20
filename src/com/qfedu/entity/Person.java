package com.qfedu.entity;

/**
 * @author Leon Downey
 * @date 2023/3/12 00:17
 * @describe： 人员实体类
 */
public class Person {

    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private String num;
    private String num01;
    private String addr;
    private String tele;
    private String num02;
    private String company;
    private Integer oper;
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNum01() {
        return num01;
    }

    public void setNum01(String num01) {
        this.num01 = num01;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getNum02() {
        return num02;
    }

    public void setNum02(String num02) {
        this.num02 = num02;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getOper() {
        return oper;
    }

    public void setOper(Integer oper) {
        this.oper = oper;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", num='" + num + '\'' +
                ", num01='" + num01 + '\'' +
                ", addr='" + addr + '\'' +
                ", tele='" + tele + '\'' +
                ", num02='" + num02 + '\'' +
                ", company='" + company + '\'' +
                ", oper=" + oper +
                ", url='" + url + '\'' +
                '}';
    }
}
