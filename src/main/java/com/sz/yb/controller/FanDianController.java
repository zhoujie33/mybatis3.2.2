package com.sz.yb.controller;

import com.sz.yb.dao.FanDianDao;
import com.sz.yb.model.FanCai;
import com.sz.yb.model.FanDian;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller
public class FanDianController {
    @Autowired
    private FanDianDao fanDianDao;

    private Logger logger = LogManager.getLogger();
    //查询全部的饭店信息
    @RequestMapping("/getAllFanDian")
    @ResponseBody
    public List<FanDian> getAllFanDian(){
        List<FanDian> list=fanDianDao.getAllFanDian();
        logger.info(list);
        return list;
    }
    //查询饭店信息带fname和mname筛选
    @RequestMapping("/getAllFanDian1")
    @ResponseBody
    public List<FanDian> getAllFanDian1(String fname,String mname) {
        FanCai fanCai=new FanCai(fname,mname);
        List<FanDian> list =fanDianDao.getAllFanDian1(fanCai);
        return list;
    }
}

