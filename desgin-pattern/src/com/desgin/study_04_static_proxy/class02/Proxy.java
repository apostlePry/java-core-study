package com.desgin.study_04_static_proxy.class02;

/**
 * @author test_jia
 * ClassName Proxy
 * PackageName com.desgin.study_04_proxy.class02
 * Description
 * <p>
 * Date: 2022/5/16
 * Time: 上午2:08
 */
public class Proxy {

    private SchoolGirl schoolGirl;

    public Proxy() {
    }

    public Proxy(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
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
