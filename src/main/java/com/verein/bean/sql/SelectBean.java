package com.verein.bean.sql;

/**
 * Created by LinYaoyao on 16/12/1.
 *
 * 数据库查询入参 排序 、 分页、 搜索关键字
 */
public class SelectBean {
    // 表名
    private String tableName;
    // 页码
    private String pageNo;
    // 条数
    private String pageSize;
    // 排序
    private String order;
    // 关键字
    private String searchKey;
    private String searchValue;
    // 过滤条件
    private String filterKey;
    private String filterValue;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getPageNo() {
        return pageNo;
    }

    public void setPageNo(String pageNo) {
        this.pageNo = pageNo;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

    public String getFilterKey() {
        return filterKey;
    }

    public void setFilterKey(String filterKey) {
        this.filterKey = filterKey;
    }

    public String getFilterValue() {
        return filterValue;
    }

    public void setFilterValue(String filterValue) {
        this.filterValue = filterValue;
    }

    @Override
    public String toString() {
        return "SelectBean{" +
                "tableName='" + tableName + '\'' +
                ", pageNo='" + pageNo + '\'' +
                ", pageSize='" + pageSize + '\'' +
                ", order='" + order + '\'' +
                ", searchKey='" + searchKey + '\'' +
                ", searchValue='" + searchValue + '\'' +
                ", filterKey='" + filterKey + '\'' +
                ", filterValue='" + filterValue + '\'' +
                '}';
    }
}
