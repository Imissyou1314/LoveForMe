package com.miss.imissyou.loveforme.models;

import com.miss.imissyou.loveforme.bean.ResultMsg;

import retrofit2.http.POST;

/**
 * Created by Imissyou on 2016/9/7.
 */
public interface LoginModels {

    @POST("user/loginIn")
    ResultMsg  Login();

}
