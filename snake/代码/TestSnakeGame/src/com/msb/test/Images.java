package com.msb.test;

import javax.swing.*;
import java.net.URL;

/**
 * @author : msb-zhaoss
 */
public class Images {
    //将图片对应的路径封装为对象：
    public static URL bodyURL = Images.class.getResource("/images/body.png");
    //然后再根据路径，将路径封装为对应的图片的对象：
    public static ImageIcon bodyImg = new ImageIcon(bodyURL);
    //将图片对应的路径封装为对象：
    public static URL downURL = Images.class.getResource("/images/down.png");
    //然后再根据路径，将路径封装为对应的图片的对象：
    public static ImageIcon downImg = new ImageIcon(downURL);
    //将图片对应的路径封装为对象：
    public static URL foodURL = Images.class.getResource("/images/food.png");
    //然后再根据路径，将路径封装为对应的图片的对象：
    public static ImageIcon foodImg = new ImageIcon(foodURL);
    //将图片对应的路径封装为对象：
    public static URL headerURL = Images.class.getResource("/images/header.png");
    //然后再根据路径，将路径封装为对应的图片的对象：
    public static ImageIcon headerImg = new ImageIcon(headerURL);
    //将图片对应的路径封装为对象：
    public static URL leftURL = Images.class.getResource("/images/left.png");
    //然后再根据路径，将路径封装为对应的图片的对象：
    public static ImageIcon leftImg = new ImageIcon(leftURL);
    //将图片对应的路径封装为对象：
    public static URL rightURL = Images.class.getResource("/images/right.png");
    //然后再根据路径，将路径封装为对应的图片的对象：
    public static ImageIcon rightImg = new ImageIcon(rightURL);
    //将图片对应的路径封装为对象：
    public static URL upURL = Images.class.getResource("/images/up.png");
    //然后再根据路径，将路径封装为对应的图片的对象：
    public static ImageIcon upImg = new ImageIcon(upURL);

}
