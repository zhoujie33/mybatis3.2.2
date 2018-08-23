package com.sz.yb.model;

public class FanCai {
    private String fname;
    private String mname;

    public FanCai() {
    }

    public FanCai(String fname, String mname) {
        this.fname = fname;
        this.mname = mname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }
}
