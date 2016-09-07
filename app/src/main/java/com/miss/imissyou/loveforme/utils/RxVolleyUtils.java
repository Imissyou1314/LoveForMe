package com.miss.imissyou.loveforme.utils;

import com.miss.imissyou.loveforme.constant.Constant;

import retrofit2.Retrofit;

/**
 * Created by Imissyou on 2016/9/6.
 */
public class RxVolleyUtils {

    /** 缓存mRetrofit单类*/
    static Retrofit mRetrofit = null;

    /**
     * 创建Retrofit的单例
     * @return
     */
    public static Retrofit getInstance() {
        if (null == mRetrofit) {
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(Constant.SERVER_URL)
                    .build();
        }
        return mRetrofit;
    }
}
