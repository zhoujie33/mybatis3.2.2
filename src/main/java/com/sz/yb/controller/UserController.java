package com.sz.yb.controller;

import com.sz.yb.dao.UserDao;
import com.sz.yb.model.YbUser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserDao userDao;
    private Logger logger = LogManager.getLogger();

    /*去登陆*/
    @RequestMapping("/tologin")
    public String login(){ return "user/login";}
    /*登陆*/
    @RequestMapping("/login")
    public String login(String uname, String upwd, HttpServletRequest req){
        YbUser ybUser =new YbUser();
        ybUser.setUname(uname);
        ybUser.setUpwd(upwd);
        YbUser user=userDao.login(ybUser);
        if (user==null){
            req.setAttribute("msg","用户名和密码不匹配");
            return "user/login";
        }else {
            HttpSession session =req.getSession();
            session.setAttribute("user",user);
            return "user/main";
        }

    }
    //处理右侧显示
    @RequestMapping("/doRight")
    public String right(){
        return "user/right";
    }
    //处理用户管理--ModelAndView
    @RequestMapping("/doUM")
    public ModelAndView userManage(){
        ModelAndView mv=null;
        List<YbUser> list =userDao.getAllUser();
        /*req.setAttribute("list",list);*/
        mv=new ModelAndView("user/uManage");
        mv.addObject("list",list);
        return mv;
    }
    //处理删除用户
    @RequestMapping("/dodelete")
    public String deleteUser(HttpServletRequest req,String uid){
        userDao.deleteUser(Integer.parseInt(uid));
        List<YbUser> list =userDao.getAllUser();
        return "redirect:/doUM.action";
    }
    //批量删除用户
    @RequestMapping("/deleteAll")
    public String deleteUsers(int[]uid, Model model){
        /*这里的int[]uid 本来是String类型，但spring框架自动将其装换为了int；
          uid数组名与页面input 的name=uid保持一致；
          Model与Servlet中的HttpServlet req的功能相似，也可以保存数据，并在页面获取，也是一次请求生命周期。
         */
        int n=0;
        for (int id: uid) {
            n+=userDao.deleteUser(id);
        }
        return "redirect:/doUM.action";
    }
    //去修改用户页面
    @RequestMapping("/dotoupdate")
    public String toUpdate(String uid,HttpServletRequest req){
        YbUser ybUser =userDao.getUserByID(Integer.parseInt(uid));
        req.setAttribute("ybUser",ybUser);
        //req.setAttribute("uid",uid);
        return "user/toupdate";
    }
    //处理修改用户
    @RequestMapping("/doupdate")
    public String updateUser(String uid,String upwd,String oldupwd,
                             String newupwd,String reupwd,HttpServletRequest req){
        logger.info("old"+oldupwd+"   pwd"+upwd);
        if (upwd.equals(oldupwd)){
            if (newupwd.equals(reupwd)){
                YbUser user =new YbUser();
                user.setUid(Integer.parseInt(uid));
                user.setUpwd(reupwd);
                int n=userDao.updateUser(user);
                if (n>0){
                    req.setAttribute("msg","修改成功！");
                }else {
                    req.setAttribute("msg","修改失败！");
                }
            }else {
                req.setAttribute("msg","新密码两次输入不一致！");
            }
        }else {
            req.setAttribute("msg","原密码输入错误！");
        }
        return "forward:/doUM.action";
    }
    /*@RequestMapping("/dologin")
    public ModelAndView dologin(String uname, String upwd, HttpServletRequest req){
        ModelAndView mv =null;
        YbUser ybUser =new YbUser(uname,upwd);
        YbUser user=iYbUserService.getUser(ybUser);
        if (user==null){
            mv=new ModelAndView("error");
        }else {
            HttpSession session=req.getSession();
            session.setAttribute("user",user);
            List<YbUser> list =iYbUserService.getAllUser();
            //req.setAttribute("list",list);

            mv= new ModelAndView("main");
            mv.addObject("list",list);

        }
        return mv;
    }*/
    /*@RequestMapping("/getAllUser")
    public List<YbUser>  getAllUser(Model model){
        List<YbUser> list=userDao.getAllUser();
        model.addAttribute("list",list);
        return list;
    }
    @RequestMapping("/getAllUser1")
    public List<YbUser>  getAllUser1(String uname){
        YbUser user =new YbUser();
        user.setUname(uname);
        List<YbUser> list=userDao.getAllUser1(user);
        return list;
    }*/


}
