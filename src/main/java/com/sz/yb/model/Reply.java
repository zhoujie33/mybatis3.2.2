package com.sz.yb.model;

import java.util.Date;

public class Reply {
    private int rid;
    private int cid;
    private String rname;
    private String rmsg;
    private Date rdate;

    public Reply() {
    }

    public Reply(int rid, int cid, String rname, String rmsg, Date rdate) {
        this.rid = rid;
        this.cid = cid;
        this.rname = rname;
        this.rmsg = rmsg;
        this.rdate = rdate;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getrname() {
        return rname;
    }

    public void setrname(String rname) {
        this.rname = rname;
    }

    public String getRmsg() {
        return rmsg;
    }

    public void setRmsg(String rmsg) {
        this.rmsg = rmsg;
    }

    public Date getRdate() {
        return rdate;
    }

    public void setRdate(Date rdate) {
        this.rdate = rdate;
    }
}
