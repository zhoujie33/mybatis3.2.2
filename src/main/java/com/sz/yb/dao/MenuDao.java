package com.sz.yb.dao;
import com.sz.yb.model.YbMenu;

import java.util.List;

public interface MenuDao {
    //查询所有菜单
    public List<YbMenu> getAllMenu();
    //查询-传入YbMenu ybMenu
    public List<YbMenu> getMenus(YbMenu ybMenu);
    //查询-传入数组、集合
    public List<YbMenu> getMenusByIDs(int[] arr);

    //新增一个菜单
    public int addMenu(YbMenu menu);

    //删除一个菜单
    public int deleteMenu(int uid);

    //修改一个菜单
    public  int updateMenu(YbMenu menu);
}
