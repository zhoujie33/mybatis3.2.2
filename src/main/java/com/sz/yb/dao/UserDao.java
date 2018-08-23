package com.sz.yb.dao;


import com.sz.yb.model.Pages;
import com.sz.yb.model.YbMenu;
import com.sz.yb.model.YbUser;

import java.util.List;

public interface UserDao {
    //查询所有用户
    public List<YbUser> getAllUser();

    //动态sql
    public List<YbUser> getAllUser1(YbUser user);

    //查询用户-uid
    public YbUser getUserByID(int uid);
    //查询用户-uname
    public List<YbUser> getUserByName(String uname);
    //用户登陆查询
    public YbUser login(YbUser user);
    //查询用户-分页
    public List<YbUser> getUserByPage(Pages pages);
    //新增一个用户
    public int addUser(YbUser user);

    //删除一个用户
    public int deleteUser(int uid);

    //修改一个用户
    public  int updateUser(YbUser user);

}
