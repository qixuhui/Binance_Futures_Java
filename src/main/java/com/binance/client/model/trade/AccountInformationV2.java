package com.binance.client.model.trade;

import com.binance.client.constant.BinanceApiConstants;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;
import java.util.List;

/**
 * 账户信息V2 (需要有效的API-KEY)
 *
 * @author xingyu
 */
public class AccountInformationV2 {

    /**
     * 是否可以入金
     */
    private Boolean canDeposit;

    /**
     * 是否可以交易
     */
    private Boolean canTrade;

    /**
     * 是否可以出金
     */
    private Boolean canWithdraw;

    /**
     * 手续费等级
     */
    private BigDecimal feeTier;

    /**
     * 最大可转出余额
     */
    private BigDecimal maxWithdrawAmount;

    /**
     * 但前所需起始保证金总额(存在逐仓请忽略)
     */
    private BigDecimal totalInitialMargin;

    /**
     * 维持保证金总额
     */
    private BigDecimal totalMaintMargin;

    /**
     * 账户总余额
     */
    private BigDecimal totalMarginBalance;

    /**
     * 当前挂单所需起始保证金(基于最新标记价格)
     */
    private BigDecimal totalOpenOrderInitialMargin;

    /**
     * 持仓所需起始保证金(基于最新标记价格)
     */
    private BigDecimal totalPositionInitialMargin;

    /**
     * 持仓未实现盈亏总额
     */
    private BigDecimal totalUnrealizedProfit;

    /**
     * 账户总余额
     */
    private BigDecimal totalWalletBalance;

    /**
     * 0
     */
    private Long updateTime;

    /**
     * 资产
     */
    private List<AssetV2> assets;

    /**
     * 头寸，将返回所有市场symbol。
     * 根据用户持仓模式展示持仓方向，即双向模式下只返回BOTH持仓情况，单向模式下只返回 LONG 和 SHORT 持仓情况
     */
    private List<Position> positions;

    /**
     * 手续费等级
     */
    private BigDecimal totalCrossWalletBalance;

    /**
     * 手续费等级
     */
    private BigDecimal totalCrossUnPnl;

    /**
     * 手续费等级
     */
    private BigDecimal availableBalance;

    public Boolean getCanDeposit() {
        return canDeposit;
    }

    public void setCanDeposit(Boolean canDeposit) {
        this.canDeposit = canDeposit;
    }

    public Boolean getCanTrade() {
        return canTrade;
    }

    public void setCanTrade(Boolean canTrade) {
        this.canTrade = canTrade;
    }

    public Boolean getCanWithdraw() {
        return canWithdraw;
    }

    public void setCanWithdraw(Boolean canWithdraw) {
        this.canWithdraw = canWithdraw;
    }

    public BigDecimal getFeeTier() {
        return feeTier;
    }

    public void setFeeTier(BigDecimal feeTier) {
        this.feeTier = feeTier;
    }

    public BigDecimal getMaxWithdrawAmount() {
        return maxWithdrawAmount;
    }

    public void setMaxWithdrawAmount(BigDecimal maxWithdrawAmount) {
        this.maxWithdrawAmount = maxWithdrawAmount;
    }

    public BigDecimal getTotalInitialMargin() {
        return totalInitialMargin;
    }

    public void setTotalInitialMargin(BigDecimal totalInitialMargin) {
        this.totalInitialMargin = totalInitialMargin;
    }

    public BigDecimal getTotalMaintMargin() {
        return totalMaintMargin;
    }

    public void setTotalMaintMargin(BigDecimal totalMaintMargin) {
        this.totalMaintMargin = totalMaintMargin;
    }

    public BigDecimal getTotalMarginBalance() {
        return totalMarginBalance;
    }

    public void setTotalMarginBalance(BigDecimal totalMarginBalance) {
        this.totalMarginBalance = totalMarginBalance;
    }

    public BigDecimal getTotalOpenOrderInitialMargin() {
        return totalOpenOrderInitialMargin;
    }

    public void setTotalOpenOrderInitialMargin(BigDecimal totalOpenOrderInitialMargin) {
        this.totalOpenOrderInitialMargin = totalOpenOrderInitialMargin;
    }

    public BigDecimal getTotalPositionInitialMargin() {
        return totalPositionInitialMargin;
    }

    public void setTotalPositionInitialMargin(BigDecimal totalPositionInitialMargin) {
        this.totalPositionInitialMargin = totalPositionInitialMargin;
    }

    public BigDecimal getTotalUnrealizedProfit() {
        return totalUnrealizedProfit;
    }

    public void setTotalUnrealizedProfit(BigDecimal totalUnrealizedProfit) {
        this.totalUnrealizedProfit = totalUnrealizedProfit;
    }

    public BigDecimal getTotalWalletBalance() {
        return totalWalletBalance;
    }

    public void setTotalWalletBalance(BigDecimal totalWalletBalance) {
        this.totalWalletBalance = totalWalletBalance;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public List<AssetV2> getAssets() {
        return assets;
    }

    public void setAssets(List<AssetV2> assets) {
        this.assets = assets;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }

    public BigDecimal getTotalCrossWalletBalance() {
        return totalCrossWalletBalance;
    }

    public void setTotalCrossWalletBalance(BigDecimal totalCrossWalletBalance) {
        this.totalCrossWalletBalance = totalCrossWalletBalance;
    }

    public BigDecimal getTotalCrossUnPnl() {
        return totalCrossUnPnl;
    }

    public void setTotalCrossUnPnl(BigDecimal totalCrossUnPnl) {
        this.totalCrossUnPnl = totalCrossUnPnl;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE).append("canDeposit", canDeposit)
                .append("canTrade", canTrade).append("canWithdraw", canWithdraw).append("feeTier", feeTier)
                .append("maxWithdrawAmount", maxWithdrawAmount).append("totalInitialMargin", totalInitialMargin)
                .append("totalMaintMargin", totalMaintMargin).append("totalMarginBalance", totalMarginBalance)
                .append("totalOpenOrderInitialMargin", totalOpenOrderInitialMargin)
                .append("totalPositionInitialMargin", totalPositionInitialMargin)
                .append("totalUnrealizedProfit", totalUnrealizedProfit).append("totalWalletBalance", totalWalletBalance)
                .append("updateTime", updateTime).append("assets", assets).append("positions", positions)
                .append("totalCrossWalletBalance", totalCrossWalletBalance)
                .append("totalCrossUnPnl", totalCrossUnPnl)
                .append("availableBalance", availableBalance)
                .toString();
    }
}
