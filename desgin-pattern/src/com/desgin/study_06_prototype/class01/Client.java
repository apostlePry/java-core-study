package com.desgin.study_06_prototype.class01;

/**
 * @author test_jia
 * ClassName Client
 * PackageName com.desgin.study_06_prototype.class01
 * Description
 * <p> 没有使用原型模式，每个简历都需要重新创建对象
 * Date: 2022/5/17
 * Time: 上午11:06
 */
public class Client {

    public static void main(String[] args) {
        // 第一份简历
        Resume resume = new Resume("test_jia");
        resume.setAge(24);
        resume.setSex("男");
        resume.setWorkDate("2017/05/14-2018/11/30");
        resume.setCompany("hello");
        resume.showResume();

        // 第二份简历
        Resume resume1 = new Resume("test_jia");
        resume1.setAge(24);
        resume1.setSex("男");
        resume1.setWorkDate("20119/05/14-2020/11/30");
        resume1.setCompany("hello");
        resume1.showResume();
    }
}
