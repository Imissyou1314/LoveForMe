package com.miss.imissyou.loveforme.bean;

/**
 * 交互对象
 * Created by Imissyou on 2016/9/7.
 */
public class ResultMsg {

    /** 获取的信息结果*/
    String resultInfo;

    /** 获取到的错误信息*/
    String resultError;

    /** 获取的信息数据*/
    Object resultData;

    /** 是否获取成功*/
    Boolean isSuccess;


    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    public String getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }

    public String getResultError() {
        return resultError;
    }

    public void setResultError(String resultError) {
        this.resultError = resultError;
    }

    public Object getResultData() {
        return resultData;
    }

    public void setResultData(Object resultData) {
        this.resultData = resultData;
    }

    @Override
    public String toString() {
        return "ResultMsg{" +
                "resultInfo='" + resultInfo + '\'' +
                ", resultError='" + resultError + '\'' +
                ", resultData=" + resultData +
                ", isSuccess=" + isSuccess +
                '}';
    }
}
