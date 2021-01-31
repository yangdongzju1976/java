
import java.awt.image.*;//BufferedImage
import javax.imageio.ImageIO;
import java.io.IOException;
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
	//构造器初始化构造柱子对象
	public Column(){
		//初始化柱子图片。
		try{
			img=ImageIO.read(this.getClass().getResource("img/column.png"));//把图片存入变量bg
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
