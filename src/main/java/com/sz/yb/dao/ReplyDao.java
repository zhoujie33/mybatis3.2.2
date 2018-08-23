package com.sz.yb.dao;

import com.sz.yb.model.FanDian;
import com.sz.yb.model.Reply;

import java.util.List;

public interface ReplyDao {

    //1.获取所有回复
    public List<Reply> getAllReply();
    //2.新增回复
    public int addFanDian(Reply reply);

    //3.修改回复
    public int updateReply(Reply reply);
    public int updateReplyByID(int rid);

    //4.删除回复
    public int deleteReply(int rid);

}
