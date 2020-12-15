package com.binance.client;

import com.binance.client.constant.BinanceApiConstants;
import com.binance.client.exception.BinanceApiException;

import java.net.URL;

/**
 * 请求API的配置
 *
 * @author xingyu
 */
public class RequestOptions {

    private String url = BinanceApiConstants.API_BASE_URL;

    public RequestOptions() {
    }

    public RequestOptions(RequestOptions option) {
        this.url = option.url;
    }

    public String getUrl() {
        return url;
    }

    /**
     * 设置请求的URL。
     *
     * @param url The URL name like "https://fapi.binance.com".
     */
    public void setUrl(String url) {
        try {
            URL u = new URL(url);
            this.url = u.toString();
        } catch (Exception e) {
            throw new BinanceApiException(BinanceApiException.INPUT_ERROR, "The URI is incorrect: " + e.getMessage());
        }
        this.url = url;
    }
}
