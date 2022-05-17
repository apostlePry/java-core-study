package com.desgin.study_06_prototype.class02;

/**
 * @author test_jia
 * ClassName Client
 * PackageName com.desgin.study_06_prototype.class02
 * Description
 * <p> 使用克隆方法，浅拷贝，如果属性是引用类型，克隆出来的对象属性被修改后，所有简历都会被修改
 * Date: 2022/5/17
 * Time: 上午11:13
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resume = new Resume("test");
        resume.setPersonInfo("男", 21);
        resume.setWorkInfo("timi", "2018/01/21-2019/09/23");

        Resume clone = resume.clone();
        clone.setWorkInfo("caca", "2020/01/01-2022/01/01");
        resume.showResume();
        clone.showResume();
    }
}
