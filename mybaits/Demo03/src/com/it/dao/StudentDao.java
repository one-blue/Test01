package com.it.dao;

import com.it.bean.StudetBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StudentDao {
    /**查询所有的人
     * @return
     */
    List<StudetBean> findAll();

    /**
     * 增加一个学生
     *
     * @param s
     * @return
     */
   int addStudent(StudetBean s);
    /**
     * 删除一个学生
     *
     * @param sid
     * @return
     */
    int delStudent(int sid);
    /**
     * 修改学生
     *
     * @param s
     * @return
     */
    int updateStudent(StudetBean s);
    /**
     * 查询学生
     *
     * @param map
     * @return
     */
    List<StudetBean> getStudent1(Map map);
    List<StudetBean> getStudent2(String sname,String city);
    List<StudetBean> getStudent3(@Param("sname") String sname, @Param("city") String city);
}
