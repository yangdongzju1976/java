
import java.awt.image.*;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Tools
{
	/*
	������
	*/
	public static BufferedImage getImg(String path){
		//����һ��ͼƬ
		BufferedImage img=null;
		try{
			img=ImageIO.read(Tools.class.getResource(path));//��ͼƬ�������bg
		} catch (IOException e) {
			e.printStackTrace();
		}
		return img;
	}
}  
