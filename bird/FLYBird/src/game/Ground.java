
/**
 * ������
 * @author Lenovo1
 *
 */

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Ground {
	//x����
	int x;
	//y����
	int y;
	//�����ͼƬ
	BufferedImage img;
	//����Ŀ��
	int w;
	//����ĸ߶�
	int h;
	//����Ĺ����������������������
	public Ground() {
		//�ȳ�ʼ������ͼƬ
		try {
			img = ImageIO.read(this.getClass().getResource("../image/ground.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//��ȡͼƬ�߶�
		h = img.getHeight();
		//��ȡͼƬ�Ŀ��
		w = img.getWidth();
		//��ʼ��x
		x = 0;
		//��ʼy
		y = 740 - 166;

	}
	//�����ƶ��ķ���
	public void move() {
		if(x>= -(w-600)) {
			x--	;
			
			
		}
		else x=0;
		
	
		
		
		
	}
	
}
