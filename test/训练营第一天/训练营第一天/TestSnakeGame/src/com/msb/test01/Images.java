package com.msb.test01;

import javax.swing.*;
import java.net.URL;

/**
 * @author : msb-zhaoss
 * Images 这个类算是一个工具类，里面就是负责加载游戏中所涉及到的图片
 */
public class Images {
    //将图片的路径先封装为对象：
    public static URL headerURL = Images.class.getResource("/images/header.png");
    //通过这个路径，再将图片封装为对象：
    public static ImageIcon headerImg = new ImageIcon(headerURL);
    //将图片的路径先封装为对象：
    public static URL bodyURL = Images.class.getResource("/images/body.png");
    //通过这个路径，再将图片封装为对象：
    public static ImageIcon bodyImg = new ImageIcon(bodyURL);
    //将图片的路径先封装为对象：
    public static URL downURL = Images.class.getResource("/images/down.png");
    //通过这个路径，再将图片封装为对象：
    public static ImageIcon downImg = new ImageIcon(downURL);
    //将图片的路径先封装为对象：
    public static URL foodURL = Images.class.getResource("/images/food.png");
    //通过这个路径，再将图片封装为对象：
    public static ImageIcon foodImg = new ImageIcon(foodURL);
    //将图片的路径先封装为对象：
    public static URL leftURL = Images.class.getResource("/images/left.png");
    //通过这个路径，再将图片封装为对象：
    public static ImageIcon leftImg = new ImageIcon(leftURL);
    //将图片的路径先封装为对象：
    public static URL rightURL = Images.class.getResource("/images/right.png");
    //通过这个路径，再将图片封装为对象：
    public static ImageIcon rightImg = new ImageIcon(rightURL);
    //将图片的路径先封装为对象：
    public static URL upURL = Images.class.getResource("/images/up.png");
    //通过这个路径，再将图片封装为对象：
    public static ImageIcon upImg = new ImageIcon(upURL);

}
