package com.sz.yb.dao;

import com.sz.yb.model.YbMsg;

import java.util.List;

public interface MsgDao {
    //1.获取所有评论
    public List<YbMsg> getAllMsg();
    //2.新增评论
    public int addYbMsgn(YbMsg ybMsg);

    //3.修改评论
    public int updateYbMsg(YbMsg ybMsg);
    public int updateYbMsgByID(int cid);

    //4.删除评论
    public int deleteYbMsg(int cid);
}
