package com.limao.hqlh.entity;

import java.util.Date;

public class SkRecords {
    private Integer recordsId;

    private Integer goodsId;

    private Date createTime;

    private Integer plusMount;

    private Integer subMount;

    public Integer getRecordsId() {
        return recordsId;
    }

    public void setRecordsId(Integer recordsId) {
        this.recordsId = recordsId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getPlusMount() {
        return plusMount;
    }

    public void setPlusMount(Integer plusMount) {
        this.plusMount = plusMount;
    }

    public Integer getSubMount() {
        return subMount;
    }

    public void setSubMount(Integer subMount) {
        this.subMount = subMount;
    }
}