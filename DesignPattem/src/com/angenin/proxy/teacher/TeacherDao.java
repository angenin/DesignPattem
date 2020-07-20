package com.angenin.proxy.teacher;

/**
 * @package_name: com.angenin.proxy.staticproxy
 * @name: TeacherDao
 * @author: angenin
 * @dateTime: 2020/7/13 11:36 上午
 **/

//教师类
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("老师正在授课...");
    }
}
