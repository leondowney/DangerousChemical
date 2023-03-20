package com.qfedu.entity;

/**
 * @author Leon Downey
 * @date 2023/3/12 00:17
 * @describe： 分页实体类
 */
public class Page {

    private Integer pageIndex;//第几页 页码
    private Integer pageSize;//每页展示多少条记录  页大小
    private Integer totalCount;//总记录数
    private Integer pages;//总页数
    private Integer start;//数据起始行 就是 limit 后面的第一个数

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }
}
