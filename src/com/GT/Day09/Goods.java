package com.GT.Day09;

public class Goods {
    private String GoodsNum;
    private String GoodsName;
    private int GoodsPrice;
    private int GoodsCount;

    public Goods() {
    }

    public Goods(String GoodsNum, String GoodsName, int GoodsPrice, int GoodsCount) {
        this.GoodsNum = GoodsNum;
        this.GoodsName = GoodsName;
        this.GoodsPrice = GoodsPrice;
        this.GoodsCount = GoodsCount;
    }

    /**
     * 获取
     * @return GoodsNum
     */
    public String getGoodsNum() {
        return GoodsNum;
    }

    /**
     * 设置
     * @param GoodsNum
     */
    public void setGoodsNum(String GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * 获取
     * @return GoodsName
     */
    public String getGoodsName() {
        return GoodsName;
    }

    /**
     * 设置
     * @param GoodsName
     */
    public void setGoodsName(String GoodsName) {
        this.GoodsName = GoodsName;
    }

    /**
     * 获取
     * @return GoodsPrice
     */
    public int getGoodsPrice() {
        return GoodsPrice;
    }

    /**
     * 设置
     * @param GoodsPrice
     */
    public void setGoodsPrice(int GoodsPrice) {
        this.GoodsPrice = GoodsPrice;
    }

    /**
     * 获取
     * @return GoodsCount
     */
    public int getGoodsCount() {
        return GoodsCount;
    }

    /**
     * 设置
     * @param GoodsCount
     */
    public void setGoodsCount(int GoodsCount) {
        this.GoodsCount = GoodsCount;
    }

    public String toString() {
        return "Goods{GoodsNum = " + GoodsNum + ", GoodsName = " + GoodsName + ", GoodsPrice = " + GoodsPrice + ", GoodsCount = " + GoodsCount + "}";
    }
}
