package com.miss.imissyou.loveforme.bean;

import java.util.Date;

/**
 * 销售地区记录
 * Created by Imissyou on 2016/9/7.
 */
public class AddressLog {

    /** 销售索引号*/
    Long Id;

    /** 销售地区Id*/
    Long addressId;

    /** 销售员Id*/
    Long saleerId;

    /** 销售时间*/
    Date saleTime;

    /** 销售数量*/
    Integer saleNumber;

    /** 销售后对该地区的评价*/
    String addressDesc;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Long getSaleerId() {
        return saleerId;
    }

    public void setSaleerId(Long saleerId) {
        this.saleerId = saleerId;
    }

    public Date getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(Date saleTime) {
        this.saleTime = saleTime;
    }

    public Integer getSaleNumber() {
        return saleNumber;
    }

    public void setSaleNumber(Integer saleNumber) {
        this.saleNumber = saleNumber;
    }

    public String getAddressDesc() {
        return addressDesc;
    }

    public void setAddressDesc(String addressDesc) {
        this.addressDesc = addressDesc;
    }

    @Override
    public String toString() {
        return "AddressLog{" +
                "Id=" + Id +
                ", addressId=" + addressId +
                ", saleerId=" + saleerId +
                ", saleTime=" + saleTime +
                ", saleNumber=" + saleNumber +
                ", addressDesc='" + addressDesc + '\'' +
                '}';
    }
}
