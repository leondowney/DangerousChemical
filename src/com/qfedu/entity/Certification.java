package com.qfedu.entity;

/**
 * @author Leon Downey
 * @date 2023/3/14 09:00
 * @describe：
 */
public class Certification {

    private String name;
    private String url;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    @Override
    public String toString() {
        return "Certification{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
