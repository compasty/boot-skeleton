package com.bilitrend.boot.model;

/**
 * @author yanhuai
 * @version $Id: Pagination.java, v 0.1 2021年03月29日 8:00 下午 yanhuai Exp $
 */
public class Pagination {

    private static final int DEFAULT_PAGE_SIZE = 10;
    private static final int DEFAULT_PAGE_NO   = 0;

    /**
     * Page number, start from 1.
     */
    private int pageNum;

    /**
     * Page size.
     */
    private int pageSize;

    /**
     * Total.
     */
    private long total;

    public Pagination() {
        this.pageNum = DEFAULT_PAGE_NO;
        this.pageSize = DEFAULT_PAGE_SIZE;
    }

    public Pagination(int pageNum, int pageSize) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    public Pagination(int pageNum, int pageSize, long total) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.total = total;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}