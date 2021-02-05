package com.ie.dao;

import com.ie.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMyBatis {
    @Test
    public void run1() throws IOException {
        Account account=new Account();
        account.setName("张三");
        account.setMoney(250d);
//        加载配置文件
        InputStream inputStream= Resources.getResourceAsStream("SqlMapConfig.xml");
//        创建SqlSessionFactory对象
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);
//        创建SqlSession对象
        SqlSession session=factory.openSession();
//        获取到代理对象
        IAccountdao dao=session.getMapper(IAccountdao.class);
        dao.saveAccount(account);
//        提交事务
        session.commit();
//        关闭资源
        session.close();
        inputStream.close();
    }
    @Test
    public void run2() throws IOException {
        InputStream inputStream2=Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream2);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        IAccountdao dao1=sqlSession.getMapper(IAccountdao.class);
        List<Account> list= dao1.findAll();
        for(Account account:list){
            System.out.println(account);
        }
        sqlSession.close();
        inputStream2.close();
    }
}
