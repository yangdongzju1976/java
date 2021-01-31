import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author : msb-zhaoss
 */
public class GamePanel extends JPanel {
    //将蛇对应的所有x轴坐标放入数组中：
    int[] snakeX = new int[500];
    //将蛇对应的所有y轴坐标放入数组中：
    int[] snakeY = new int[500];
    //定义蛇的长度：
    int length;
    //定义小蛇的行走方向：
    String dirction ;

    //定义游戏的状态：
    boolean isStart ;

    //加入一个定时器：
    Timer timer;
    //定义一个初始化的方法，用来初始化小蛇的坐标：
    public void init(){
        //初始化蛇头的坐标：
        snakeX[0] = 150;
        snakeY[0] = 250;
        //初始化第一节蛇身子：
        snakeX[1] = 125;
        snakeY[1] = 250;
        //初始化第二节蛇身子：
        snakeX[2] = 100;
        snakeY[2] = 250;
        //初始化蛇的长度：
        length = 3;
        //初始化蛇的行走方向：
        dirction = "R";
        //初始化游戏的状态：
        isStart = false;//游戏最开始的时候是暂停的状态。
    }
    public GamePanel(){
        init();
        //将整个屏幕的焦点放在面板上：
        this.setFocusable(true);
        //加入监听器：
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {//这个方法用来监听是否做过键盘按压：
                super.keyPressed(e);
                //获取你按的按键的代码：
                int keyCode = e.getKeyCode();
                System.out.println(keyCode);
                if(keyCode == 32){//按下空格键
                    isStart = !isStart;
                    //刷新页面：
                    repaint();//paintComponent
                }
            }
        });

        //初始化定时器：
        timer = new Timer(100, new ActionListener() {
            //每100毫秒，执行一次actionPerformed里面的内容：
            @Override
            public void actionPerformed(ActionEvent e) {
                //每100毫秒 改变蛇的坐标：
                if(isStart){//游戏开始，小蛇行走
                    //改变蛇的坐标：
                    //后一节走到前一节：
                    //身子先走：
                    for (int i = length-1; i > 0 ; i--) {
                        snakeX[i] = snakeX[i-1];
                        snakeY[i] = snakeY[i-1];
                    }

                    //蛇头再动：
                    snakeX[0] = snakeX[0] + 25;

                    //刷新页面：
                    repaint();


                }
            }
        });

        //定时器必须要进行启动：
        timer.start();
    }

    //这个方法是  画图的逻辑 对应的方法 -》 所有画图的逻辑都写在这个方法中
    //这个方法  不用自己调用 底层 自动调用
    @Override
    protected void paintComponent(Graphics g) {//Graphics g  画笔
        super.paintComponent(g);
        //给面板设置一个背景色：
        this.setBackground(new Color(194, 221, 239));
        //画一张水印图片：
        Images.headerImg.paintIcon(this,g,10,10);
        //改变画笔的颜色：
        g.setColor(new Color(239, 219, 218));
        //画游戏区域：
        g.fillRect(10,70,770,685);

        //在对应的坐标位置 将蛇对应的图片放进去：
        //画蛇头：
        switch (dirction){
            case "U" : Images.upImg.paintIcon(this,g,snakeX[0],snakeY[0]);break;
            case "D" : Images.downImg.paintIcon(this,g,snakeX[0],snakeY[0]);break;
            case "L" : Images.leftImg.paintIcon(this,g,snakeX[0],snakeY[0]);break;
            case "R" : Images.rightImg.paintIcon(this,g,snakeX[0],snakeY[0]);break;
        }

        //画蛇身子：
        /*Images.bodyImg.paintIcon(this,g,snakeX[1],snakeY[1]);
        Images.bodyImg.paintIcon(this,g,snakeX[2],snakeY[2]);*/
        for (int i = 1; i < length; i++) {
            Images.bodyImg.paintIcon(this,g,snakeX[i],snakeY[i]);
        }

        //根据游戏的状态绘制：
        if(isStart == false){//游戏暂停
            //面板中有一段文字：
            g.setColor(new Color(159, 123, 214));
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            g.drawString("点击空格开始游戏",250,330);
        }
    }
}