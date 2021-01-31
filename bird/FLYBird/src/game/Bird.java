
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

/**
 * 小鸟类
 * @author Lenovo1
 *
 */
public class Bird {
	//鸟的图片
	BufferedImage img;
	//x坐标
	int x;
	//y坐标
	int y;
	//初速度
    double v0;
    //时间间隔（网上移动的时间）
    double t;
    //距离
    double s;
    //重力
    double g;
    
	//鸟的构造器用来创建鸟对象
	//用来装一组图片的容器
	List<BufferedImage> list;
    public Bird() {
		//获取鸟的图片
    	try {
			img = ImageIO.read(this.getClass().getResource("../image/0.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
    	//x
    			x = 100;
    	//y
    			y = 200;
        //初始化装图片容器
    		    list = new ArrayList<BufferedImage>();
    		    
        //向容器中添加图片
    		    
    				try {
						list.add(ImageIO.read(this.getClass().getResource("../image/0.png")))  ;
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
 
    				try {
						list.add(ImageIO.read(this.getClass().getResource("../image/1.png")))  ;
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}try {
						list.add(ImageIO.read(this.getClass().getResource("../image/2.png")))  ;
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}try {
						list.add(ImageIO.read(this.getClass().getResource("../image/3.png")))  ;
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}try {
						list.add(ImageIO.read(this.getClass().getResource("../image/4.png")))  ;
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}try {
						list.add(ImageIO.read(this.getClass().getResource("../image/5.png")))  ;
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}try {
						list.add(ImageIO.read(this.getClass().getResource("../image/6.png")))  ;
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						list.add(ImageIO.read(this.getClass().getResource("../image/7.png")))  ;
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					//初始化初速度
					v0 = 3;
					//时间
					t = 0.2;
					//距离
					s = 0;
					//重力
					g = 5;
   }
	
    //鸟的翅膀动起来
    int index =0;//标记下标获取图片
    public void fly() {
    	if(index >= 8) {
    		index=0;
    	}
    	img =list.get(index);
    	index++;
    	
    }
    //小鸟的落体运动
    public void move() {
    	//计算小鸟上抛的距离
    	s = v0 * t;
    	//得到小鸟上抛最高点时y坐标
    	y=y-(int)s;
    	//计算小鸟到达最高点的速度
    	double v2 = v0-g*t; 
    	//最高点的速度就是小鸟下落时的初速度
    	v0 = v2;
    }
	//小鸟上抛运动
    public void moveup() {
    	v0=20;
    }
    
    //小鸟与顶部或者发生碰撞
    public boolean hit(){
    	if(y<=0||y>=534) {
    		return true;
    	}
    	return false;//没有碰撞
    	
    }
    //小鸟柱子的碰撞
    public boolean hit(Column column) {
    	if(x>=column.x-40 && x<=column.x+column.w) {
    		if(y>column.h/2+ column.y-column.gap/2 && y<column.h/2+column.y+column.gap/2- 40 ) {
    			return false;//安全通过
    			
    		}
		return true;//撞到了
	
    }
    return false;//没撞到
    	
    }
    
}
















