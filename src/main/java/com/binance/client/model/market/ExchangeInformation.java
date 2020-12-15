package com.binance.client.model.market;

import com.binance.client.constant.BinanceApiConstants;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * 交易规则和交易对
 *
 * @author xingyu
 */
public class ExchangeInformation {

    /**
     * 服务器所用的时间区域
     */
    private String timezone;

    /**
     * 系统时间
     */
    private Long serverTime;

    /**
     * API访问的限制
     */
    private List<RateLimit> rateLimits;

    private List<ExchangeFilter> exchangeFilters;

    /**
     * 交易对信息
     */
    private List<ExchangeInfoEntry> symbols;

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Long getServerTime() {
        return serverTime;
    }

    public void setServerTime(Long serverTime) {
        this.serverTime = serverTime;
    }

    public List<RateLimit> getRateLimits() {
        return rateLimits;
    }

    public void setRateLimits(List<RateLimit> rateLimits) {
        this.rateLimits = rateLimits;
    }

    public List<ExchangeFilter> getExchangeFilters() {
        return exchangeFilters;
    }

    public void setExchangeFilters(List<ExchangeFilter> exchangeFilters) {
        this.exchangeFilters = exchangeFilters;
    }

    public List<ExchangeInfoEntry> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<ExchangeInfoEntry> symbols) {
        this.symbols = symbols;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE).append("timezone", timezone)
                .append("serverTime", serverTime).append("rateLimits", rateLimits)
                .append("exchangeFilters", exchangeFilters).append("symbols", symbols).toString();
    }
}
