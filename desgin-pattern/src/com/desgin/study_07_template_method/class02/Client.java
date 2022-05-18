package com.desgin.study_07_template_method.class02;

/**
 * @author test_jia
 * ClassName Client
 * PackageName com.desgin.study_07_template_method.class01
 * Description
 * <p> 学生A 学生B 使用不完善的模版方法模式，
 * 通过抽象，将所有问题抽象进入父类，然后子类方法可以调用父类方法，来使用问题。
 * Date: 2022/5/18
 * Time: 下午11:21
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("第一个学生答案:");
        StudentAPaper studentAPaper = new StudentAPaper();
        studentAPaper.questionOne();
        studentAPaper.questionTwo();
        studentAPaper.questionThree();
        System.out.println("第二个学生答案:");
        StudentBPaper studentBPaper = new StudentBPaper();
        studentBPaper.questionOne();
        studentBPaper.questionTwo();
        studentBPaper.questionThree();
    }
}
