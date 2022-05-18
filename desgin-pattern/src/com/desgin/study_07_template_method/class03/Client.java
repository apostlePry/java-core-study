package com.desgin.study_07_template_method.class03;

/**
 * @author test_jia
 * ClassName Client
 * PackageName com.desgin.study_07_template_method.class01
 * Description
 * <p> 学生A 学生B 使用完善的模版方法模式，封装定义各题的答案方法，子类重写实现答案方法，
 * 父类就能通过调用答案方法获取对应子类的实现获取值
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
