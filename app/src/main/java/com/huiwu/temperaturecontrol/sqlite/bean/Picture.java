package com.huiwu.temperaturecontrol.sqlite.bean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

/**
 * Entity mapped to table "PICTURE".
 */
public class Picture {

    private Long id;
    /**
     * Not-null value.
     */
    private String boxno;
    /**
     * Not-null value.
     */
    private String linkuuid;
    /**
     * Not-null value.
     */
    private String file;
    /**
     * Not-null value.
     */
    private String sealOropen;
    private Boolean havepost;

    public Picture() {
    }

    public Picture(Long id) {
        this.id = id;
    }

    public Picture(Long id, String boxno, String linkuuid, String file, String sealOropen, Boolean havepost) {
        this.id = id;
        this.boxno = boxno;
        this.linkuuid = linkuuid;
        this.file = file;
        this.sealOropen = sealOropen;
        this.havepost = havepost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Not-null value.
     */
    public String getBoxno() {
        return boxno;
    }

    /**
     * Not-null value; ensure this value is available before it is saved to the database.
     */
    public void setBoxno(String boxno) {
        this.boxno = boxno;
    }

    /**
     * Not-null value.
     */
    public String getLinkuuid() {
        return linkuuid;
    }

    /**
     * Not-null value; ensure this value is available before it is saved to the database.
     */
    public void setLinkuuid(String linkuuid) {
        this.linkuuid = linkuuid;
    }

    /**
     * Not-null value.
     */
    public String getFile() {
        return file;
    }

    /**
     * Not-null value; ensure this value is available before it is saved to the database.
     */
    public void setFile(String file) {
        this.file = file;
    }

    /**
     * Not-null value.
     */
    public String getSealOropen() {
        return sealOropen;
    }

    /**
     * Not-null value; ensure this value is available before it is saved to the database.
     */
    public void setSealOropen(String sealOropen) {
        this.sealOropen = sealOropen;
    }

    public Boolean getHavepost() {
        return havepost;
    }

    public void setHavepost(Boolean havepost) {
        this.havepost = havepost;
    }

}
