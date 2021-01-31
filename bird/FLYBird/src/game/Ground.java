
/**
 * 地面类
 * @author Lenovo1
 *
 */

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Ground {
	//x坐标
	int x;
	//y坐标
	int y;
	//地面的图片
	BufferedImage img;
	//地面的宽度
	int w;
	//地面的高度
	int h;
	//地面的构造器，用来构建地面对象
	public Ground() {
		//先初始化地面图片
		try {
			img = ImageIO.read(this.getClass().getResource("../image/ground.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//获取图片高度
		h = img.getHeight();
		//获取图片的宽度
		w = img.getWidth();
		//初始化x
		x = 0;
		//初始y
		y = 740 - 166;

	}
	//地面移动的方法
	public void move() {
		if(x>= -(w-600)) {
			x--	;
			
			
		}
		else x=0;
		
	
		
		
		
	}
	
}
