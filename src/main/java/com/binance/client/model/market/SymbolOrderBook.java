package com.binance.client.model.market;

import com.binance.client.constant.BinanceApiConstants;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;

/**
 * 当前最优挂单
 *
 * @author xingyu
 */
public class SymbolOrderBook {

    /**
     * 交易对
     */
    private String symbol;
    /**
     * 最优买单价
     */
    private BigDecimal bidPrice;
    /**
     * 挂单量
     */
    private BigDecimal bidQty;
    /**
     * 最优卖单价
     */
    private BigDecimal askPrice;
    /**
     * 挂单量
     */
    private BigDecimal askQty;

    /**
     * 撮合引擎时间
     */
    private Long time;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(BigDecimal bidPrice) {
        this.bidPrice = bidPrice;
    }

    public BigDecimal getBidQty() {
        return bidQty;
    }

    public void setBidQty(BigDecimal bidQty) {
        this.bidQty = bidQty;
    }

    public BigDecimal getAskPrice() {
        return askPrice;
    }

    public void setAskPrice(BigDecimal askPrice) {
        this.askPrice = askPrice;
    }

    public BigDecimal getAskQty() {
        return askQty;
    }

    public void setAskQty(BigDecimal askQty) {
        this.askQty = askQty;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE).append("symbol", symbol)
                .append("bidPrice", bidPrice).append("bidQty", bidQty).append("askPrice", askPrice)
                .append("askQty", askQty)
                .append("time", time).toString();
    }
}
