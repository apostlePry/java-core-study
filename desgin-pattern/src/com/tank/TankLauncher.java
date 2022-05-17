package com.tank;

import com.tank.helper.SleepHelper;

/**
 * @author test_jia
 * ClassName TankLantcher
 * PackageName com.tank
 * Description
 * <p> 坦克启动器
 * Date: 2022/5/17
 * Time: 下午4:02
 */
public class TankLauncher {
    public static void main(String[] args) {
        TankFrame tankFrame = new TankFrame();
        tankFrame.setVisible(true);

        for (;;) {
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tankFrame.repaint();
        }
    }
}
