package com.desgin.study_07_template_method.class01;

/**
 * @author test_jia
 * ClassName Client
 * PackageName com.desgin.study_07_template_method.class01
 * Description
 * <p> 学生A 学生B 没有使用模版方法模式
 * 其中每道题都是一样的，只是答案不同，这样每个题都会写一份，修改的时候会需要修改所有内容
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
