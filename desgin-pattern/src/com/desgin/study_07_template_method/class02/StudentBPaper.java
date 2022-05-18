package com.desgin.study_07_template_method.class02;

/**
 * @author test_jia
 * ClassName StudentAPaper
 * PackageName com.desgin.study_07_template_method.class01
 * Description
 * <p>
 * Date: 2022/5/18
 * Time: 下午11:22
 */
public class StudentBPaper extends Questions {

    public void questionOne() {
        super.questionOne();
        System.out.println("答案: a");
    }

    public void questionTwo() {
        super.questionTwo();
        System.out.println("答案: c");
    }

    public void questionThree() {
        super.questionThree();
        System.out.println("答案: b");
    }
}
