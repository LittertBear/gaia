package com.ihongqiqu.gaia.request;

import android.support.annotation.IntDef;
import android.support.annotation.NonNull;
import java.util.HashMap;

/**
 * 请求参数
 * <p/>
 * 必须设置请求url
 * 可以设置请求方式(GET,POST,UPLOAD)
 * 可以设置请求返回数据的格式(STRING,JSON,XML)
 * 可以添加需要的参数params
 * <p/>
 * Created by zhenguo on 10/14/15.
 */
public class RequestParam {

    /**
     * Supported request methods.
     */
    @IntDef({Method.GET, Method.POST, Method.UPLOAD})
    public @interface Method {
        int GET = 0;
        int POST = 1;
        int UPLOAD = 2;

    }

    @IntDef({DataFormat.String, DataFormat.JSON, DataFormat.XML})
    public @interface DataFormat {
        int String = 10;
        int JSON = 11;
        int XML = 12;
    }

    /**
     * 请求方式 get post upload 默认GET
     */
    private int method = Method.GET;
    /**
     * 返回数据格式 JSON XML String 默认JSON
     */
    private int dataFormat = DataFormat.JSON;

    /**
     * 请求地址
     */
    private String url;

    private HashMap<String, String> params;

    /**
     * 添加请求参数
     *
     * @param k 参数关键字
     * @param v 参数值
     */
    public void addParams(@NonNull String k, String v) {
        if (params == null) {
            params = new HashMap<>();
        }
        params.put(k, v);
    }

    public HashMap<String, String> getParams() {
        return params;
    }

    @Method
    public int getMethod() {
        return method;
    }


    public void setMethod(@Method int method) {
        this.method = method;
    }

    @DataFormat
    public int getDataFormat() {
        return dataFormat;
    }

    public void setDataFormat(@DataFormat int dataFormat) {
        this.dataFormat = dataFormat;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
