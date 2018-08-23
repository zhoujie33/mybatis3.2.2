package com.sz.yb.dao;

import com.sz.yb.model.FanCai;
import com.sz.yb.model.FanDian;

import java.util.List;

public interface FanDianDao {
    //1.获取所有饭店
    public List<FanDian> getAllFanDian();
    //2.动态sql传入参数fname 和mname
    public List<FanDian> getAllFanDian1(FanCai fanCai);
    //2.新增饭店
    public int addFanDian(FanDian fanDian);

    //3.修改饭店
    public int updateFanDian(FanDian fanDian);
    public int updateFanDianByID(int fid);
    public int updateFanDianByName(String fname);



    //4.删除饭店
    public int deleteFandian(int fid);
}
