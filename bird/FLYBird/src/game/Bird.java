
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

/**
 * С����
 * @author Lenovo1
 *
 */
public class Bird {
	//���ͼƬ
	BufferedImage img;
	//x����
	int x;
	//y����
	int y;
	//���ٶ�
    double v0;
    //ʱ�����������ƶ���ʱ�䣩
    double t;
    //����
    double s;
    //����
    double g;
    
	//��Ĺ������������������
	//����װһ��ͼƬ������
	List<BufferedImage> list;
    public Bird() {
		//��ȡ���ͼƬ
    	try {
			img = ImageIO.read(this.getClass().getResource("../image/0.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
    	//x
    			x = 100;
    	//y
    			y = 200;
        //��ʼ��װͼƬ����
    		    list = new ArrayList<BufferedImage>();
    		    
        //�����������ͼƬ
    		    
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
					//��ʼ�����ٶ�
					v0 = 3;
					//ʱ��
					t = 0.2;
					//����
					s = 0;
					//����
					g = 5;
   }
	
    //��ĳ������
    int index =0;//����±��ȡͼƬ
    public void fly() {
    	if(index >= 8) {
    		index=0;
    	}
    	img =list.get(index);
    	index++;
    	
    }
    //С��������˶�
    public void move() {
    	//����С�����׵ľ���
    	s = v0 * t;
    	//�õ�С��������ߵ�ʱy����
    	y=y-(int)s;
    	//����С�񵽴���ߵ���ٶ�
    	double v2 = v0-g*t; 
    	//��ߵ���ٶȾ���С������ʱ�ĳ��ٶ�
    	v0 = v2;
    }
	//С�������˶�
    public void moveup() {
    	v0=20;
    }
    
    //С���붥�����߷�����ײ
    public boolean hit(){
    	if(y<=0||y>=534) {
    		return true;
    	}
    	return false;//û����ײ
    	
    }
    //С�����ӵ���ײ
    public boolean hit(Column column) {
    	if(x>=column.x-40 && x<=column.x+column.w) {
    		if(y>column.h/2+ column.y-column.gap/2 && y<column.h/2+column.y+column.gap/2- 40 ) {
    			return false;//��ȫͨ��
    			
    		}
		return true;//ײ����
	
    }
    return false;//ûײ��
    	
    }
    
}
















