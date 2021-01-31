import java.net.URL;
import javax.swing.ImageIcon;
public class Images
{
	//将图片对应的路径封装为对象：
	public static URL bodyURL = Images.class.getResource("/images/body.png");
	 //然后再根据路径，将路径封闭为图片的对象
	public static ImageIcon bodyImg=new ImageIcon(bodyURL);
	
	
	public static URL downURL = Images.class.getResource("/images/down.png");
	public static ImageIcon downImg=new ImageIcon(downURL);

    public static URL foodURL = Images.class.getResource("/images/food.png");
	public static ImageIcon foodImg=new ImageIcon(foodURL);

	public static URL headerURL = Images.class.getResource("/images/header.png");
	public static ImageIcon headerImg=new ImageIcon(headerURL);

	public static URL leftURL = Images.class.getResource("/images/left.png");
	public static ImageIcon leftImg=new ImageIcon(leftURL);

	public static URL rightURL = Images.class.getResource("/images/right.png");
	public static ImageIcon rightImg=new ImageIcon(rightURL);

    public static URL upURL = Images.class.getResource("/images/up.png");
	public static ImageIcon upImg=new ImageIcon(upURL);



	

}