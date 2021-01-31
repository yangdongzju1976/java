
import java.awt.*;
import javax.swing.JPanel;
import java.awt.image.*;//BufferedImage
import javax.imageio.ImageIO;
import java.io.IOException;
public class GamePanel extends JPanel{
	//�������ڴ�ű���ͼƬ�ı���
	BufferedImage bg;  
	//����һ�����ڴ�ŵ���ͼƬ�Ķ��󣨱�����
	Ground ground;
	//������
	public GamePanel(){
		
		
		setBackground(Color.pink);
		//���ñ���ͼƬ
		try{
			bg=ImageIO.read(this.getClass().getResource("img/����.png"));//��ͼƬ�������bg
		} catch (IOException e) {
			e.printStackTrace();
		}
		//��ʼ���������
		ground=new Ground();
		
		}
		//��Ϸ��ʼ�ķ���
		public void start(){
			while(true){
			ground.move();
			try
			{
				//ÿ�ƶ�һ����Ϣһ��
				Thread.sleep(80);
				//����ˢ��һ�Ρ�
				repaint();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
			}
		}
		//��ͼƬ���������
		@Override
			public void paint(Graphics g){
				super.paint(g);
				//����ͼƬ
				g.drawImage(bg,0,0,null);
				//���Ƶ���ͼƬ
				g.drawImage(ground.img,ground.x,ground.y,null);
			}

}