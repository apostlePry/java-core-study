package com.desgin.study_06_prototype.class03;

import java.io.Serializable;

/**
 * @author test_jia
 * ClassName Resume
 * PackageName com.desgin.study_06_prototype.class02
 * Description
 * <p>
 * Date: 2022/5/17
 * Time: 上午11:15
 */
public class Resume implements Cloneable, Serializable {
    private String name;
    private String sex;
    private int age;
    private WorkInfo info;

    public Resume(String name) {
        this.name = name;
        this.info = new WorkInfo();
    }

    private Resume(WorkInfo info) throws CloneNotSupportedException {
        this.info = (WorkInfo) info.clone();
    }

    public void setPersonInfo(String sex, int age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkInfo(String company, String workDate) {
        info.setCompany(company);
        info.setWorkDate(workDate);
    }

    public void showResume() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", info=" + info +
                '}';
    }

    @Override
    public Resume clone() throws CloneNotSupportedException {
        Resume resume = new Resume(this.info);
        resume.name = this.name;
        resume.sex = this.sex;
        resume.age = this.age;
        return resume;
    }
}
