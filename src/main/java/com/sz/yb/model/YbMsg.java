package com.sz.yb.model;

import java.util.Date;
import java.util.List;

public class YbMsg {
    private int cid ;
    private int mid;
    private String uname;
    private String msg;
    private int point;
    private Date mdate;
    private List<Reply> list;
    @Override
    public String toString() {
        return "YbMsg{" +
                "cid=" + cid +
                ", mid=" + mid +
                ", uname='" + uname + '\'' +
                ", msg='" + msg + '\'' +
                ", point=" + point +
                ", mdate=" + mdate +
                '}';
    }

    public YbMsg() {
    }

    public YbMsg(int cid, int mid, String uname, String msg, int point, Date mdate) {
        this.cid = cid;
        this.mid = mid;
        this.uname = uname;
        this.msg = msg;
        this.point = point;
        this.mdate = mdate;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Date getMdate() {
        return mdate;
    }

    public void setMdate(Date mdate) {
        this.mdate = mdate;
    }

    public List<Reply> getList() {
        return list;
    }

    public void setList(List<Reply> list) {
        this.list = list;
    }
}
