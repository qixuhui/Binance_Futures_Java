package com.binance.client.model.trade;

import com.binance.client.constant.BinanceApiConstants;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;

/**
 * 持仓
 *
 * @author xingyu
 */
public class PositionRisk {

    /**
     * 开仓均价
     */
    private BigDecimal entryPrice;
    /**
     * 逐仓模式或全仓模式
     */
    private String marginType;

    /**
     * 逐仓保证金
     */
    private String isolatedMargin;
    /**
     * 当前杠杆倍数
     */
    private BigDecimal leverage;

    /**
     * 参考强平价格
     */
    private BigDecimal liquidationPrice;
    /**
     * 开仓均价
     */
    private BigDecimal markPrice;

    /**
     * 当前杠杆倍数允许的名义价值上限
     */
    private Double maxNotionalValue;
    /**
     * 头寸数量，符号代表多空方向, 正数为多，负数为空
     */
    private BigDecimal positionAmt;
    /**
     * 交易对
     */
    private String symbol;
    /**
     * 持仓未实现盈亏
     */
    private BigDecimal unrealizedProfit;

    /**
     * 持仓方向 BOTH空  LONG多
     */
    private String positionSide;

    public BigDecimal getEntryPrice() {
        return entryPrice;
    }

    public void setEntryPrice(BigDecimal entryPrice) {
        this.entryPrice = entryPrice;
    }

    public BigDecimal getLeverage() {
        return leverage;
    }

    public void setLeverage(BigDecimal leverage) {
        this.leverage = leverage;
    }

    public Double getMaxNotionalValue() {
        return maxNotionalValue;
    }

    public void setMaxNotionalValue(Double maxNotionalValue) {
        this.maxNotionalValue = maxNotionalValue;
    }

    public BigDecimal getLiquidationPrice() {
        return liquidationPrice;
    }

    public void setLiquidationPrice(BigDecimal liquidationPrice) {
        this.liquidationPrice = liquidationPrice;
    }

    public BigDecimal getMarkPrice() {
        return markPrice;
    }

    public void setMarkPrice(BigDecimal markPrice) {
        this.markPrice = markPrice;
    }

    public BigDecimal getPositionAmt() {
        return positionAmt;
    }

    public void setPositionAmt(BigDecimal positionAmt) {
        this.positionAmt = positionAmt;
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

    public String getIsolatedMargin() {
        return isolatedMargin;
    }

    public void setIsolatedMargin(String isolatedMargin) {
        this.isolatedMargin = isolatedMargin;
    }

    public String getPositionSide() {
        return positionSide;
    }

    public void setPositionSide(String positionSide) {
        this.positionSide = positionSide;
    }

    public String getMarginType() {
        return marginType;
    }

    public void setMarginType(String marginType) {
        this.marginType = marginType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE).append("entryPrice", entryPrice)
                .append("leverage", leverage).append("maxNotionalValue", maxNotionalValue)
                .append("liquidationPrice", liquidationPrice).append("markPrice", markPrice)
                .append("positionAmt", positionAmt).append("symbol", symbol)
                .append("unrealizedProfit", unrealizedProfit).append("isolatedMargin", isolatedMargin)
                .append("positionSide", positionSide).append("marginType", marginType).toString();
    }
}
