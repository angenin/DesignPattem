package com.angenin.proxy.cglib;

import com.angenin.proxy.teacher.ITeacherDao;

/**
 * @package_name: com.angenin.proxy.staticproxy
 * @name: TeacherDao
 * @author: angenin
 * @dateTime: 2020/7/13 11:36 上午
 **/

//教师类
public class TeacherDao {

    public String teach() {
        System.out.println("老师正在授课...（cglib代理，不需要实现接口）");
        return "teacher";
    }
}
