package com.msb.test01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author : msb-zhaoss
 * GamePanel游戏面板   想具备面板的能力，必须继承一个面板类：
 */
public class GamePanel extends JPanel {
    //定义小蛇的长度：
    int length;
    //定义一个数组，专门用来存储小蛇的x轴坐标;
    int[] snakeX = new int[600];
    //定义一个数组，专门用来存储小蛇的y轴坐标;
    int[] snakeY = new int[600];

    //加入一个小蛇的行走方向：
    String direction ;
    //加入一个布尔类型的变量，来指定游戏是否开始：
    boolean isStart = false;//默认游戏没有开始

    //对定义的属性进行初始化操作：
    public void init(){
        //初始化蛇的长度为3
        length = 3;
        //初始化  蛇头 坐标：
        snakeX[0] = 150;
        snakeY[0] = 275;
        //初始化 第一节身子 坐标：
        snakeX[1] = 125;
        snakeY[1] = 275;
        //初始化  第二节身子 坐标：
        snakeX[2] = 100;
        snakeY[2] = 275;
        //定义小蛇初始化方向：
        direction = "R";
    }

    public GamePanel(){
        init();
        //将 系统焦点 放在面板上：
        this.setFocusable(true);
        //加入一个监听器：
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {//监听按下去的动作：
                super.keyPressed(e);
                //获取你按的按键：
                int keyCode = e.getKeyCode();
                System.out.println(keyCode);
                if(keyCode == 32){//按住空格了
                    //将isStart设置为相反的值？？？
                    isStart = !isStart;
                    //页面重新绘制：
                    repaint();//底层调用的还是paintComponent
                }
            }
        });
    }
    //重写一个方法：paintComponent
    //所有在面板中画图的逻辑，都要写在这个方法里
    //paintComponent底层自动调用，无需我们调用
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //设置面板的背景颜色：
        this.setBackground(new Color(209, 237, 239));
        //插入一个头部图片：
        Images.headerImg.paintIcon(this,g,10,10);
        //画一个矩形区域：
        //将画笔的颜色改变一下：
        g.setColor(new Color(239, 219, 218));
        g.fillRect(10,70,770,685);

        //在对应的位置，将蛇头画进去：
        switch (direction){
            case "L" : Images.leftImg.paintIcon(this,g,snakeX[0],snakeY[0]);break;
            case "R" : Images.rightImg.paintIcon(this,g,snakeX[0],snakeY[0]);break;
            case "U" : Images.upImg.paintIcon(this,g,snakeX[0],snakeY[0]);break;
            case "D" : Images.downImg.paintIcon(this,g,snakeX[0],snakeY[0]);break;
        }
        //在对应的位置，将第1节身子画进去：
        //Images.bodyImg.paintIcon(this,g,snakeX[1],snakeY[1]);
        //在对应的位置，将第2节身子画进去：
        //Images.bodyImg.paintIcon(this,g,snakeX[2],snakeY[2]);
        for (int i = 1; i < length; i++) {
            Images.bodyImg.paintIcon(this,g,snakeX[i],snakeY[i]);
        }

        //游戏没有开始，面板中要加入一句话加入一个提示：点击空格游戏开始：
        if(isStart == false){//游戏是暂停的：
            //中间写入文字：
            g.setColor(new Color(159, 123, 214));
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            g.drawString("点击空格开始游戏",250,330);
        }
    }
}
