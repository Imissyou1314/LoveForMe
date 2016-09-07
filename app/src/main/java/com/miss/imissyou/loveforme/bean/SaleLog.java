package com.miss.imissyou.loveforme.bean;

/**
 * 销售记录
 * Created by Imissyou on 2016/9/7.
 */
public class SaleLog {

    /** 记录ID号*/
    Long Id;

    /** 销售员ID号*/
    Long salerId;

    /** 销售数量*/
    Integer saleCountNumber;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getSalerId() {
        return salerId;
    }

    public void setSalerId(Long salerId) {
        this.salerId = salerId;
    }

    public Integer getSaleCountNumber() {
        return saleCountNumber;
    }

    public void setSaleCountNumber(Integer saleCountNumber) {
        this.saleCountNumber = saleCountNumber;
    }

    @Override
    public String toString() {
        return "SaleLog{" +
                "Id=" + Id +
                ", salerId=" + salerId +
                ", saleCountNumber=" + saleCountNumber +
                '}';
    }
}
