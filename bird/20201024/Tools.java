
import java.awt.image.*;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Tools
{
	/*
	工具类
	*/
	public static BufferedImage getImg(String path){
		//声明一个图片
		BufferedImage img=null;
		try{
			img=ImageIO.read(Tools.class.getResource(path));//把图片存入变量bg
		} catch (IOException e) {
			e.printStackTrace();
		}
		return img;
	}
}  
