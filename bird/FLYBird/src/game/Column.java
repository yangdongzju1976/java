

import java.awt.image.BufferedImage;

import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

/**
 * 柱子类
 * @author Lenovo1
 *
 */
public class Column {
	//柱子图片
	BufferedImage img;
	//x坐标
	int x;
	
	//y坐标
	int y;
	//柱子的宽度
	int w;
	//柱子的高度
	int h;
	//柱子间间距
	int distance;
	//声明一个随机数对象
	//安全间隙
	int gap;
	Random ran = new Random();
	//构造器初始化构造柱子对象（i表示第几根柱子）
	public Column(int i) {       
	//初始化柱子图片
		try {
			img = ImageIO.read(this.getClass().getResource("../image/column.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		//获取图片的宽度
		w = 65;
		//获取图片的高度
		h = 700;
		//初始化柱子间距
		distance = 300;
		//设置x坐标
		x=800+300*(i-1);
		//设置y坐标(0~n之间的随机整数-1)
		y= -ran.nextInt(120);  
		gap = 90; 
	}
	//柱子移动
	public void move() {
		
		x--;
		if(x<=-65) {
			x= 300 +distance;
			
			
		}
	}

}
