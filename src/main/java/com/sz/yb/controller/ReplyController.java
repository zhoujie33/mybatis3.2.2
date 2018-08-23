package com.sz.yb.controller;

import com.sz.yb.dao.MsgDao;
import com.sz.yb.model.YbMsg;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReplyController {

    @Autowired
    private MsgDao msgDao;

    private Logger logger = LogManager.getLogger();

    @RequestMapping("/getAllMsg")
    public List<YbMsg> getAllMsg(){
        List<YbMsg> list=msgDao.getAllMsg();
        return list;
    }
}
