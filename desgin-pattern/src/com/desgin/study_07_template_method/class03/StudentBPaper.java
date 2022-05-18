package com.desgin.study_07_template_method.class03;

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

    @Override
    public String answerOne() {
        return "b";
    }

    @Override
    public String answerTwo() {
        return "a";
    }

    @Override
    public String answerThree() {
        return "d";
    }
}
