package com.tank;

import java.awt.*;

/**
 * @author test_jia
 * ClassName TankFrame
 * PackageName com.tank
 * Description
 * <p> 坦克窗口类
 * Date: 2022/5/17
 * Time: 下午4:01
 */
public class TankFrame extends Frame {
    private int x = 100;
    public TankFrame() {
        this.setTitle("tank war");
        this.setLocation(500, 300);
        this.setSize(1000,600);
    }

    @Override
    public void paint(Graphics g) {
        g.fillRect(x, 100, 40, 40);
        x++;
    }
}
