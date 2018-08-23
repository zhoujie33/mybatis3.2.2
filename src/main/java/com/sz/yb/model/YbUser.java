package com.sz.yb.model;

import java.util.List;

public class YbUser {
    private int uid;
    private String uname;
    private String upwd;
    private String pic;
    private int urid;
    private List<YbMenu> list;
    public YbUser() {
    }

    @Override
    public String toString() {
        return "YbUser{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                '}';
    }

    public YbUser(int uid, String uname, String upwd) {
        this.uid = uid;
        this.uname = uname;
        this.upwd = upwd;
    }

    public YbUser(int uid, String uname, String upwd, int urid) {
        this.uid = uid;
        this.uname = uname;
        this.upwd = upwd;
        this.urid = urid;
    }

    public YbUser(String uname, String upwd, int urid) {
        this.uname = uname;
        this.upwd = upwd;
        this.urid = urid;
    }

    public YbUser(String uname, String upwd, String pic) {
        this.uname = uname;
        this.upwd = upwd;
        this.pic = pic;
    }

    public YbUser(String uname, String upwd) {
        this.uname = uname;
        this.upwd = upwd;
    }

    public int getUid() {
        return uid;
    }

    public String getUname() {
        return uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public int getUrid() {
        return urid;
    }

    public void setUrid(int urid) {
        this.urid = urid;
    }

    public List<YbMenu> getList() {
        return list;
    }

    public void setList(List<YbMenu> list) {
        this.list = list;
    }
}
