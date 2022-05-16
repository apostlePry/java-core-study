package com.desgin.study_04_static_proxy.class01;

/**
 * @author test_jia
 * ClassName SchoolGirl
 * PackageName com.desgin.study_04_proxy.class01
 * Description
 * <p> 业务对象，学校的女孩
 * Date: 2022/5/16
 * Time: 上午2:00
 */
public class SchoolGirl {

    private String name;

    public SchoolGirl() {
    }

    public SchoolGirl(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
