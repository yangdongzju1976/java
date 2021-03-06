package src;

import java.awt.*;
import javax.swing.JPanel;
import java.awt.image.*;//BufferedImage
import javax.imageio.ImageIO;
import java.io.IOException;
public class GamePanel extends JPanel{
	//声明用于存放背景图片的变量
	BufferedImage bg;  
	//声明一个用于存放地面图片的对象（变量）
	Ground ground;
	//构造器
	public GamePanel(){
		
		
		setBackground(Color.pink);
		//设置背景图片
		try{
			bg=ImageIO.read(this.getClass().getResource("img/背景.png"));//把图片存入变量bg
		} catch (IOException e) {
			e.printStackTrace();
		}
		//初始化地面对象
		ground=new Ground();
		
		}
		//游戏开始的方法
		public void start(){
			while(true){
			ground.move();
			try
			{
				//每移动一次休息一秒
				Thread.sleep(80);
				//重新刷新一次。
				repaint();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
			}
		}
		//把图片画到面板上
		@Override
			public void paint(Graphics g){
				super.paint(g);
				//绘制图片
				g.drawImage(bg,0,0,null);
				//绘制地面图片
				g.drawImage(ground.img,ground.x,ground.y,null);
			}

}
