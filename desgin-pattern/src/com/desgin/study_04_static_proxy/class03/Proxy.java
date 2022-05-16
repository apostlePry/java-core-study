package com.desgin.study_04_static_proxy.class03;

/**
 * @author test_jia
 * ClassName Proxy
 * PackageName com.desgin.study_04_proxy.class03
 * Description
 * <p>
 * Date: 2022/5/16
 * Time: 上午2:16
 */
public class Proxy implements SendGift {
    private Pursuit pursuit;

    public Proxy(SchoolGirl schoolGirl) {
        this.pursuit = new Pursuit(schoolGirl);
    }

    @Override
    public void sendDoll() {
        this.pursuit.sendDoll();
    }

    @Override
    public void sendFlowers() {
        this.pursuit.sendFlowers();
    }

    @Override
    public void sendChocolate() {
        this.pursuit.sendChocolate();
    }
}
