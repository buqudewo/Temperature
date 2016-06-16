package com.huiwu.temperaturecontrol.sqlite.bean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

/**
 * Entity mapped to table "GOODS_TYPE".
 */
public class GoodsType {

    private Integer id;
    private String company;
    private Integer companyid;
    private String parentgoodtype;
    private String goodtype;
    private Integer onetime;
    private Integer hightmpnumber;
    private Integer lowtmpnumber;
    private Integer parentid;
    private String createtime;
    private Integer highhumiditynumber;
    private Integer lowhumiditynumber;

    public GoodsType() {
    }

    public GoodsType(Integer id, String company, Integer companyid, String parentgoodtype, String goodtype, Integer onetime, Integer hightmpnumber, Integer lowtmpnumber, Integer parentid, String createtime, Integer highhumiditynumber, Integer lowhumiditynumber) {
        this.id = id;
        this.company = company;
        this.companyid = companyid;
        this.parentgoodtype = parentgoodtype;
        this.goodtype = goodtype;
        this.onetime = onetime;
        this.hightmpnumber = hightmpnumber;
        this.lowtmpnumber = lowtmpnumber;
        this.parentid = parentid;
        this.createtime = createtime;
        this.highhumiditynumber = highhumiditynumber;
        this.lowhumiditynumber = lowhumiditynumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getParentgoodtype() {
        return parentgoodtype;
    }

    public void setParentgoodtype(String parentgoodtype) {
        this.parentgoodtype = parentgoodtype;
    }

    public String getGoodtype() {
        return goodtype;
    }

    public void setGoodtype(String goodtype) {
        this.goodtype = goodtype;
    }

    public Integer getOnetime() {
        return onetime;
    }

    public void setOnetime(Integer onetime) {
        this.onetime = onetime;
    }

    public Integer getHightmpnumber() {
        return hightmpnumber;
    }

    public void setHightmpnumber(Integer hightmpnumber) {
        this.hightmpnumber = hightmpnumber;
    }

    public Integer getLowtmpnumber() {
        return lowtmpnumber;
    }

    public void setLowtmpnumber(Integer lowtmpnumber) {
        this.lowtmpnumber = lowtmpnumber;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public Integer getHighhumiditynumber() {
        return highhumiditynumber;
    }

    public void setHighhumiditynumber(Integer highhumiditynumber) {
        this.highhumiditynumber = highhumiditynumber;
    }

    public Integer getLowhumiditynumber() {
        return lowhumiditynumber;
    }

    public void setLowhumiditynumber(Integer lowhumiditynumber) {
        this.lowhumiditynumber = lowhumiditynumber;
    }

}