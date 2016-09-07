package com.miss.imissyou.loveforme.bean;


import java.util.Date;

/**
 * 地方记录信息
 * Created by Imissyou on 2016/9/7.
 */
public class AddressMsg {

    /** 用户ID*/
    Long Id;

    /** 地址名*/
    String addressName;

    /** 地方介绍说明*/
    String addressDesc;

    /** 地址经度*/
    Double addressLog;

    /** 地址维度*/
    Double addressLan;

    /** 总销次数*/
    Integer countNumber;

    /** 销售量*/
    Integer saleCountNumber;

    /** 最好一次的销售量*/
    Integer lastSaleNumber;

    /** 计划销售量*/
    Integer planSaleNumber;

    /** 最后的销售时间*/
    Date lastTime;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getAddressDesc() {
        return addressDesc;
    }

    public void setAddressDesc(String addressDesc) {
        this.addressDesc = addressDesc;
    }

    public Double getAddressLog() {
        return addressLog;
    }

    public void setAddressLog(Double addressLog) {
        this.addressLog = addressLog;
    }

    public Double getAddressLan() {
        return addressLan;
    }

    public void setAddressLan(Double addressLan) {
        this.addressLan = addressLan;
    }

    public Integer getCountNumber() {
        return countNumber;
    }

    public void setCountNumber(Integer countNumber) {
        this.countNumber = countNumber;
    }

    public Integer getSaleCountNumber() {
        return saleCountNumber;
    }

    public void setSaleCountNumber(Integer saleCountNumber) {
        this.saleCountNumber = saleCountNumber;
    }

    public Integer getLastSaleNumber() {
        return lastSaleNumber;
    }

    public void setLastSaleNumber(Integer lastSaleNumber) {
        this.lastSaleNumber = lastSaleNumber;
    }

    public Integer getPlanSaleNumber() {
        return planSaleNumber;
    }

    public void setPlanSaleNumber(Integer planSaleNumber) {
        this.planSaleNumber = planSaleNumber;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    @Override
    public String toString() {
        return "AddressMsg{" +
                "Id=" + Id +
                ", addressName='" + addressName + '\'' +
                ", addressDesc='" + addressDesc + '\'' +
                ", addressLog=" + addressLog +
                ", addressLan=" + addressLan +
                ", countNumber=" + countNumber +
                ", saleCountNumber=" + saleCountNumber +
                ", lastSaleNumber=" + lastSaleNumber +
                ", planSaleNumber=" + planSaleNumber +
                ", lastTime=" + lastTime +
                '}';
    }
}
