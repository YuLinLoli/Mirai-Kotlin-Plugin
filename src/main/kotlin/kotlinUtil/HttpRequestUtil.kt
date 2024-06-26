package com.mirai.kotlinUtil

import okhttp3.OkHttpClient
import okhttp3.Request


class HttpRequestUtil {
    //兼容java要写类，且要写companion object块儿
    companion object {
        /**
         * 获取并返回Json字符串（Get方法）为空的时候返回null
         * @param uri URL链接地址
         * @return responseData jsonString或者为空
         * @author YuLin <cheng_ying@outlook.com>
         */
        fun requestGet(uri: String): String? {
            
            val client = OkHttpClient()
            val request = Request.Builder()
                .get()
                .url(uri)
                .build()

            val response = client.newCall(request).execute()
            val responseData = response.body?.string()
            if (responseData != null) {
                return responseData
            }


            return null
        }


    }
}