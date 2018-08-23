package com.sz.yb.model;

import java.util.List;

public class FanDian {
    private int fid;
    private String fname;
    private List<YbMenu> list;

    @Override
    public String toString() {
        return "FanDian{" +
                "fid=" + fid +
                ", fname='" + fname + '\'' +
                '}';
    }

    public FanDian() {
    }

    public FanDian(int fid, String fname) {
        this.fid = fid;
        this.fname = fname;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public List<YbMenu> getList() {
        return list;
    }

    public void setList(List<YbMenu> list) {
        this.list = list;
    }
}
