package com.sz.yb.controller;

import com.sz.yb.dao.MenuDao;
import com.sz.yb.model.YbMenu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuController {
    @Autowired
    private MenuDao menuDao;
    private Logger logger = LogManager.getLogger();

    /*@RequestMapping("/getAllMenu")
    public List<YbMenu> getAllmenu(){
        List<YbMenu> list =menuDao.getAllMenu();
        return list;
    }*/


    /*@RequestMapping("/getMenus")
    public List<YbMenu> getMenus(String fid,String mname){//页面上 doget方法传过来的参数都为String
        YbMenu menu=new YbMenu();

        if (fid!=null){
            menu.setFid(Integer.parseInt(fid));
        }
        if (mname!=null){
            menu.setMname(mname);
        }
        List<YbMenu> list =menuDao.getMenus(menu);
        return list;
    }*/
   /* @RequestMapping("/updateMenu")
    public int updateMenu(String mid,String mname){
        YbMenu menu=new YbMenu();
        menu.setMid(Integer.parseInt(mid));
        if (mname!=null){
            menu.setMname(mname);
        }
        int n=menuDao.updateMenu(menu);
        logger.info(menu);
        return n;
    }*/
    @RequestMapping("/getMenusByIDs")
    public List<YbMenu> getMenusByIDs(){
        int[] mids={1,2,3,4,5,6};
        List<YbMenu> list=menuDao.getMenusByIDs(mids);
        return list;
    }
}
