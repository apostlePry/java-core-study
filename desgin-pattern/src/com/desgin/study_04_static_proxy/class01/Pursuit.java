package com.desgin.study_04_static_proxy.class01;

/**
 * @author test_jia
 * ClassName Pursuit
 * PackageName com.desgin.study_04_proxy.class01
 * Description
 * <p>
 * Date: 2022/5/16
 * Time: 上午2:02
 */
public class Pursuit {

    private String name;
    private SchoolGirl schoolGirl;

    public Pursuit() {
    }

    public Pursuit(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
    }

    public Pursuit(String name, SchoolGirl schoolGirl) {
        this.name = name;
        this.schoolGirl = schoolGirl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SchoolGirl getSchoolGirl() {
        return schoolGirl;
    }

    public void setSchoolGirl(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
    }

    public void sendDoll() {
        System.out.println(this.schoolGirl.getName() + ", 送你洋娃娃!");
    }

    public void sendFlowers() {
        System.out.println(this.schoolGirl.getName() + ", 送你花!");
    }

    public void sendChocolate() {
        System.out.println(this.schoolGirl.getName() + ", 送你巧克力!");
    }
}
