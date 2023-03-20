package com.qfedu.entity;

/**
 * @author Leon Downey
 * @date 2023/3/15 19:14
 * @describe：
 */
public class AccidentCondition {

    private String name;
    private String type;
    private String date;
    private String begin;
    private String end;

    public AccidentCondition(String name, String type, String date) {
        this.name = name;
        this.type = type;
        this.date = date;
    }

    public AccidentCondition(String begin, String end) {
        this.begin = begin;
        this.end = end;
    }

    public AccidentCondition() {
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "AccidentCondition{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", date='" + date + '\'' +
                ", begin='" + begin + '\'' +
                ", end='" + end + '\'' +
                '}';
    }
}


