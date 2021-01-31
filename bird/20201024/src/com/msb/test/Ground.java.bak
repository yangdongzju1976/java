package src;
import java.awt.image.*;
import java.io.IOException;
import javax.imageio.ImageIO;
/**
 *  地面类
 *
*/



public class   Ground{
	//横坐标
	int x;
	//纵坐标 
	int y;
	//地面图片
	BufferedImage img;
	//地面图片的宽度
	int w;
	//地面图片的高度
	int h;
	
	//构造器
	public Ground(){
		//初始化图片
		/*try{
			img=ImageIO.read(this.getClass().getResource("img/ground.png"));//把图片存入变量bg
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		img=Tools.getImg("img/ground.png");
		//获取地面图片的高度
		h=img.getHeight();
		//获取地面图片的宽度
		w=img.getWidth();
		//img=ImageIO.read(this.getClass().getResource(""));
	//地面图片左上角横坐标
		x=0;
	//地面图片左上角的纵坐标
		y=740-166;
	}
	//地面移动的方法
	public void move(){
		if (x<=-(w-432))
		{
			x=0;
		}
		x--;//横坐标左移

	}
}
