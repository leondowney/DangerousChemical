package com.qfedu.entity;

/**
 * @author Leon Downey
 * @date 2023/3/13 17:18
 * @describe：
 */
public class ExperienceCondition {
    private String name;
    private String type;
    private Integer pid;

    public ExperienceCondition(String name, String type, Integer pid) {

        this.name = name;
        this.type = type;
        this.pid = pid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
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

    @Override
    public String toString() {
        return "ExperienceCondition{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", pid=" + pid +
                '}';
    }
}
