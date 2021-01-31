
package src;
import java.awt.image.*;//BufferedImage
import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Random;
public class  Column
{
	//柱子的图片
	BufferedImage img;
	//柱子的坐标
	int x;
	int y;
	//柱子的宽度
	int w;
	//柱子的高度
	int h;
	//柱子间距
	int distance;
	//产生随机对象
	Random r=new Random();


	//构造器初始化构造柱子对象

	public Column(int i){ //i:表示第几根柱子。序号
		//初始化柱子图片。
	
			img=Tools.getImg("img/column.png");//把图片存入变量bg
		//获取图片的宽度
		//如果太宽，可以修改参数。如除以2。如果不除会怎么样
		w=img.getWidth()/2;
		//获取图片的高度
		h=img.getHeight()/2;
		distance=245;
		//设置柱子坐标
		//可以通过修改坐标值改变柱子的位置。
		/*x=300;
		y=-26;
		//初始化柱子间距
		
		*/
		/*switch (i)
		{
		case 1:x=300; break;
		case 2:x=545; break; 
		
		}
		*/
		x=300 + (i-1)*245;
		y=-1*r.nextInt(29);//最小-28，最大0
	}
	public void move(){
		
		if (x<-1*w)
		{
			x=300+distance;
			y=-1*r.nextInt(29);
					//System.out.println("y="+y);

		}
		x--;
	}

}
