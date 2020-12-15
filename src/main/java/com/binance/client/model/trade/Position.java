package com.binance.client.model.trade;

import com.binance.client.constant.BinanceApiConstants;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;

/**
 * 头寸
 *
 * @author xingyu
 */
public class Position {

    /**
     * 交易对
     */
    private String symbol;

    /**
     * 当前所需起始保证金(基于最新标记价格)
     */
    private BigDecimal initialMargin;

    /**
     * 维持保证金
     */
    private BigDecimal maintMargin;

    /**
     * 持仓未实现盈亏总额
     */
    private BigDecimal unrealizedProfit;

    /**
     * 持仓所需起始保证金(基于最新标记价格)
     */
    private BigDecimal positionInitialMargin;

    /**
     * 当前挂单所需起始保证金(基于最新标记价格)
     */
    private BigDecimal openOrderInitialMargin;

    /**
     * 杠杆倍率
     */
    private BigDecimal leverage;

    /**
     * 是否是逐仓模式
     */
    private Boolean isolated;

    /**
     * 持仓成本价
     */
    private String entryPrice;

    /**
     * 当前杠杆下用户可用的最大名义价值
     */
    private String maxNotional;

    /**
     * 持仓方向
     */
    private String positionSide;

    /**
     * 持仓数量
     */
    private BigDecimal positionAmt;

    public Boolean getIsolated() {
        return isolated;
    }

    public void setIsolated(Boolean isolated) {
        this.isolated = isolated;
    }

    public BigDecimal getLeverage() {
        return leverage;
    }

    public void setLeverage(BigDecimal leverage) {
        this.leverage = leverage;
    }

    public BigDecimal getInitialMargin() {
        return initialMargin;
    }

    public void setInitialMargin(BigDecimal initialMargin) {
        this.initialMargin = initialMargin;
    }

    public BigDecimal getMaintMargin() {
        return maintMargin;
    }

    public void setMaintMargin(BigDecimal maintMargin) {
        this.maintMargin = maintMargin;
    }

    public BigDecimal getOpenOrderInitialMargin() {
        return openOrderInitialMargin;
    }

    public void setOpenOrderInitialMargin(BigDecimal openOrderInitialMargin) {
        this.openOrderInitialMargin = openOrderInitialMargin;
    }

    public BigDecimal getPositionInitialMargin() {
        return positionInitialMargin;
    }

    public void setPositionInitialMargin(BigDecimal positionInitialMargin) {
        this.positionInitialMargin = positionInitialMargin;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getUnrealizedProfit() {
        return unrealizedProfit;
    }

    public void setUnrealizedProfit(BigDecimal unrealizedProfit) {
        this.unrealizedProfit = unrealizedProfit;
    }

    public String getEntryPrice() {
        return entryPrice;
    }

    public void setEntryPrice(String entryPrice) {
        this.entryPrice = entryPrice;
    }

    public String getMaxNotional() {
        return maxNotional;
    }

    public void setMaxNotional(String maxNotional) {
        this.maxNotional = maxNotional;
    }

    public String getPositionSide() {
        return positionSide;
    }

    public void setPositionSide(String positionSide) {
        this.positionSide = positionSide;
    }

    public BigDecimal getPositionAmt() {
        return positionAmt;
    }

    public void setPositionAmt(BigDecimal positionAmt) {
        this.positionAmt = positionAmt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("initialMargin", initialMargin).append("maintMargin", maintMargin)
                .append("openOrderInitialMargin", openOrderInitialMargin)
                .append("positionInitialMargin", positionInitialMargin).append("symbol", symbol)
                .append("unrealizedProfit", unrealizedProfit).append("entryPrice", entryPrice)
                .append("maxNotional", maxNotional).append("positionSide", positionSide)
                .append("isolated", isolated).toString();
    }
}
