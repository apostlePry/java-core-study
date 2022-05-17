package com.desgin.study_06_prototype.class01;

/**
 * @author test_jia
 * ClassName Resume
 * PackageName com.desgin.study_06_prototype.class01
 * Description
 * <p>
 * Date: 2022/5/17
 * Time: 上午11:07
 */
public class Resume {

    private String name;
    private String sex;
    private int age;
    private String workDate;
    private String company;

    public Resume(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", workDate='" + workDate + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public void showResume() {
        System.out.println(this);
    }
}
