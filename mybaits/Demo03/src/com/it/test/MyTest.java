package com.it.test;

import com.it.bean.StudetBean;
import com.it.dao.PersonDao;
import com.it.dao.StudentDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {
    /**
     * alt+enter导入测试
     */
    @Test
    public void test01() throws IOException {
        //1.读取配置文件
        InputStream is= Resources.getResourceAsStream("mybaits-conf.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(is);
        //3.获取sqlsession
        SqlSession session=ssf.openSession();
        PersonDao dao = session.getMapper(PersonDao.class);
        List<PersonDao> all = dao.getAll();
        System.out.println(all);
    }
    @Test
    public void test02() throws IOException {
        //1.读取配置文件
        InputStream is= Resources.getResourceAsStream("mybaits-student.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(is);
        //3.获取sqlsession
        SqlSession session=ssf.openSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        List<StudetBean> findAll = dao.findAll();
        System.out.println(findAll);
    }
    @Test
    public void test03() throws IOException {
        //1.读取配置文件
        InputStream is= Resources.getResourceAsStream("mybaits-student.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(is);
        //3.获取sqlsession
        SqlSession session=ssf.openSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        StudetBean s=new StudetBean(0,"郑成功","郑州");
        int i = dao.addStudent(s);
        System.out.println(i+"行受到影响");
        session.commit();
        session.close();
    }
    @Test
    public void test04() throws IOException {
        //1.读取配置文件
        InputStream is= Resources.getResourceAsStream("mybaits-student.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(is);
        //3.获取sqlsession
        SqlSession session=ssf.openSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        int i = dao.delStudent(5);
        System.out.println(i+"行受到影响");
        session.commit();
        session.close();
    }
    @Test
    public void test05() throws IOException {
        //1.读取配置文件
        InputStream is= Resources.getResourceAsStream("mybaits-student.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(is);
        //3.获取sqlsession
        SqlSession session=ssf.openSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        StudetBean s=new StudetBean(1,"郑成功","郑州");
        int i = dao.updateStudent(s);
        System.out.println(i+"行受到影响");
        session.commit();
        session.close();
    }
    @Test
    public void test06() throws IOException {
        //1.读取配置文件
        InputStream is= Resources.getResourceAsStream("mybaits-student.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(is);
        //3.获取sqlsession
        SqlSession session=ssf.openSession();
        StudentDao dao = session.getMapper(StudentDao.class);
       Map map=new HashMap<>();
       map.put("sname","郑成功");
       map.put("city","郑州");
        List<StudetBean> list =dao.getStudent1(map);
        System.out.println(list);
    }
    @Test
    public void test07() throws IOException {
        //1.读取配置文件
        InputStream is= Resources.getResourceAsStream("mybaits-student.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(is);
        //3.获取sqlsession
        SqlSession session=ssf.openSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        List<StudetBean> list = dao.getStudent2("程咬金", "新乡");
        System.out.println(list);
    }
    @Test
    public void test08() throws IOException {
        //1.读取配置文件
        InputStream is= Resources.getResourceAsStream("mybaits-student.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(is);
        //3.获取sqlsession
        SqlSession session=ssf.openSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        List<StudetBean> list = dao.getStudent3("程咬金", "新乡");
        System.out.println(list);
    }
}
