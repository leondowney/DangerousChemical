package com.qfedu.entity;

/**
 * @author Leon Downey
 * @date 2023/3/13 17:15
 * @describe：
 */
public class Experience {

    private Integer id;
    private String name;
    private String type;
    private String start;
    private String end;
    private String addr;
    private String experience;
    private Integer pid;

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

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", addr='" + addr + '\'' +
                ", experience='" + experience + '\'' +
                ", pid=" + pid +
                '}';
    }
}
