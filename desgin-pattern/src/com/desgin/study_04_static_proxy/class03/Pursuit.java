package com.desgin.study_04_static_proxy.class03;

/**
 * @author test_jia
 * ClassName 追求
 * PackageName com.desgin.study_04_proxy.class03
 * Description
 * <p>
 * Date: 2022/5/16
 * Time: 上午2:13
 */
public class Pursuit implements SendGift {

    private SchoolGirl schoolGirl;

    public Pursuit(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
    }

    @Override
    public void sendDoll() {
        System.out.println(this.schoolGirl.getName() + ", 送你洋娃娃!");
    }

    @Override
    public void sendFlowers() {
        System.out.println(this.schoolGirl.getName() + ", 送你花!");
    }

    @Override
    public void sendChocolate() {
        System.out.println(this.schoolGirl.getName() + ", 送你巧克力!");
    }
}
