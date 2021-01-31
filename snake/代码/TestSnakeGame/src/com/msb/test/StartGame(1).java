package com.msb.test;

import javax.swing.*;
import java.awt.*;

/**
 * @author : msb-zhaoss
 */
public class StartGame {
    //这是main方法，程序的入口
    public static void main(String[] args) {
        //创建一个窗体对象：
        JFrame jf = new JFrame();
        //给窗体设置一个标题：
        jf.setTitle("贪吃蛇小游戏 - 珊珊");
        //求屏幕的宽高：
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        //设置一下窗体打开的x,y轴坐标，对应的窗体的宽，高
        jf.setBounds((width - 800)/2,(height - 800)/2,800,800);
        //在窗口点击×的时候，程序跟着停止：
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //将窗体的大小调节为666
        // 不可变：
        jf.setResizable(false);
        //在窗体中添加面板：
        GamePanel gp = new GamePanel();
        jf.add(gp);
        //默认情况下窗体是隐藏的，现在就想将窗体 展示出来  显现出来：
        jf.setVisible(true);
    }
}
