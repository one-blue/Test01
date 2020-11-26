package com.it.test;

import com.it.bean.WorkBean;
import com.it.dao.WorkDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest02 {
    @Test
    public void test01() throws IOException {
        //1.读取配置文件
        InputStream is= Resources.getResourceAsStream("mybaits-student.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(is);
        //3.获取sqlsession
        SqlSession session=ssf.openSession();
        WorkDao dao = session.getMapper(WorkDao.class);
        List<WorkBean> all = dao.getAll();
        System.out.println(all);

    }
}
