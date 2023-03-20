package com.qfedu.entity;

/**
 * @author Leon Downey
 * @date 2023/3/14 09:03
 * @describe：
 */
public class PerCer {
    private Integer id;
    private Integer pid;
    private Integer cid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "PerCer{" +
                "id=" + id +
                ", pid=" + pid +
                ", cid=" + cid +
                '}';
    }
}
