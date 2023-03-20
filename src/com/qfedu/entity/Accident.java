package com.qfedu.entity;

/**
 * @author Leon Downey
 * @date 2023/3/15 19:09
 * @describe：
 */
public class Accident {

    private Integer id;
    private String name;
    private String type;
    private String company;
    private String date;
    private String level;
    private String count;
    private String property;
    private String person;
    private String tele;
    private String addr;
    private String solution;
    private String weight;
    private String reason;
    private String opinion;
    private String oper;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    @Override
    public String toString() {
        return "Accident{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", company='" + company + '\'' +
                ", time='" + date + '\'' +
                ", level='" + level + '\'' +
                ", count='" + count + '\'' +
                ", property='" + property + '\'' +
                ", person='" + person + '\'' +
                ", tele='" + tele + '\'' +
                ", addr='" + addr + '\'' +
                ", solution='" + solution + '\'' +
                ", weight='" + weight + '\'' +
                ", reason='" + reason + '\'' +
                ", opinion='" + opinion + '\'' +
                ", oper='" + oper + '\'' +
                '}';
    }
}
