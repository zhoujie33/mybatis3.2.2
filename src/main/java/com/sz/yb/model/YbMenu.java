package com.sz.yb.model;

import java.util.List;

public class YbMenu {
    private int mid;
    private String mname;
    private int fid;
    //private List<YbMsg> list;

    @Override
    public String toString() {
        return "YbMenu{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", fid=" + fid +
                '}';
    }

    public YbMenu() {
    }

    public YbMenu(String mname, int fid) {
        this.mname = mname;
        this.fid = fid;
    }

    public YbMenu(int mid, String mname, int fid) {
        this.mid = mid;
        this.mname = mname;
        this.fid = fid;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    /*public List<YbMsg> getList() {
        return list;
    }

    public void setList(List<YbMsg> list) {
        this.list = list;
    }*/
}
