package com.qfedu.entity;

/**
 * @author Leon Downey
 * @date 2023/3/16 14:12
 * @describe：
 */
public class AccidentAnalyse {
    private String name;
    private Integer value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "AccidentAnalyse{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';

    }
}
