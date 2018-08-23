import com.sz.yb.dao.UserDao;
import com.sz.yb.model.Pages;
import com.sz.yb.model.YbUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import java.io.IOException;
import java.io.Reader;
import java.util.List;


public class TestUser {
    private Logger logger= LogManager.getLogger();
    private static UserDao userDao=null;
    private static Reader reader=null;
    private static SqlSessionFactory sqlSessionFactory=null;
    private static SqlSession  sqlSession=null;
    static {//以下是mybatis进行数据库CRUD操作的相同步骤代码


        //1.读取mybatis核心配置文件
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //2.获取会化工厂
        sqlSessionFactory =new SqlSessionFactoryBuilder().build(reader);
        //3.获取会话
        sqlSession=sqlSessionFactory.openSession(true);//true表示自动提交事务
        //4.获取dao
        userDao=sqlSession.getMapper(UserDao.class);
    }
    @Test
    public void getAllUser(){
        //5.Dao调用sql映射配置文件中的sql语句
        try {
            List<YbUser> list =userDao.getAllUser();
            for (YbUser u: list) {
                logger.info(u.toString());
            }
        } finally {
            sqlSession.close();
        }
    }
    @Test
    public void addUser(){
        try {
            YbUser user=new YbUser("sss","sss",1);
            int n=userDao.addUser(user);
            if (n>0){
                logger.info("新增用户成功");
            }
        } finally {
            sqlSession.close();
        }
    }
    @Test
    public void deleteUser(){
        try {
            int n=userDao.deleteUser(25);
            if (n>0){
                logger.info("删除用户成功");
            }
        } finally {
            sqlSession.close();
        }
    }
    @Test
    public void updateUser(){
        try {
            YbUser user =new YbUser(23,"rrr","rrr",1);
            int n=userDao.updateUser(user);
            if (n>0){
                logger.info("修改用户成功");
            }
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void getUserByID(){
        try {
            YbUser user=userDao.getUserByID(21);
            logger.info(user.toString());
        } finally {
            sqlSession.close();
        }
    }
    @Test
    public void getUserByName(){
        try {
            List<YbUser> list =userDao.getUserByName("a");
            for (YbUser u:list) {
                logger.info(u.toString());
            }
        } finally {
            sqlSession.close();
        }
    }
    @Test
    public void getUserByPage(){
        try {
            Pages pages =new Pages();
            pages.setSize(3);
            pages.setStart(pages.getSize()*(1-1));
            List<YbUser> list =userDao.getUserByPage(pages);
            for (YbUser u:list) {
                logger.info(u.toString());
            }
        } finally {
            sqlSession.close();
        }
    }
}
