import com.sz.yb.dao.MenuDao;
import com.sz.yb.model.YbMenu;
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

public class TestMenu {
    private Logger logger= LogManager.getLogger();
    static private Reader reader=null;
    static private SqlSessionFactory sqlSessionFactory=null;
    static private SqlSession sqlSession=null;
    static MenuDao menuDao=null;
    static {
        //1.读取mybatis核心配置文件
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //2.获取会话工厂
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        //3获取会话
        sqlSession=sqlSessionFactory.openSession(true);
        //4.获取dao
        menuDao=sqlSession.getMapper(MenuDao.class);
    }

    //获取所有菜单
    @Test
    public void getAllmenu(){
        //5.Dao调用sql映射配置文件中的sql语句
        List<YbMenu> list=menuDao.getAllMenu();
        for (YbMenu m:list) {
            logger.info(list.toString());
        }
    }
    @Test
    public void addMenu(){
        YbMenu menu =new YbMenu("爆炒牛肚",1);
        int n=menuDao.addMenu(menu);
        if (n>0){
            logger.info("新增菜单成功");
        }
    }
    @Test
    public void updateMenu(){
        YbMenu menu =new YbMenu(7,"爆炒牛肚2",2);
        int n=menuDao.updateMenu(menu);
        if (n>0){
            logger.info("修改菜单成功");
        }
    }
    @Test
    public void deleteMenu(){
        int n=menuDao.deleteMenu(7);
        if (n>0){
            logger.info("删除菜单成功");
        }
    }
}
