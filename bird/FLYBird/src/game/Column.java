

import java.awt.image.BufferedImage;

import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

/**
 * ������
 * @author Lenovo1
 *
 */
public class Column {
	//����ͼƬ
	BufferedImage img;
	//x����
	int x;
	
	//y����
	int y;
	//���ӵĿ���
	int w;
	//���ӵĸ߶�
	int h;
	//���Ӽ���
	int distance;
	//����һ�����������
	//��ȫ��϶
	int gap;
	Random ran = new Random();
	//��������ʼ���������Ӷ���i��ʾ�ڼ������ӣ�
	public Column(int i) {       
	//��ʼ������ͼƬ
		try {
			img = ImageIO.read(this.getClass().getResource("../image/column.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		//��ȡͼƬ�Ŀ���
		w = 65;
		//��ȡͼƬ�ĸ߶�
		h = 700;
		//��ʼ�����Ӽ��
		distance = 300;
		//����x����
		x=800+300*(i-1);
		//����y����(0~n֮����������-1)
		y= -ran.nextInt(120);  
		gap = 90; 
	}
	//�����ƶ�
	public void move() {
		
		x--;
		if(x<=-65) {
			x= 300 +distance;
			
			
		}
	}

}