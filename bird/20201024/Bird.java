import java.awt.image.BufferedImage;
import java.util.*; 
//import java.util.Arrays;
public class Bird 
{
	//���ͼƬ
	BufferedImage img;
	//�������
	int x,y;
	//��Ŀ���
	int w,h;
	//����װһ��ͼƬ������
	List <BufferedImage> list;
	//���ٶ�
	double v0;
	//ʱ����(���ϵ�ʱ��)
	double t;
	//����
	double s;
	//����
	double g;


	public Bird(){
		//��ȡ���ͼƬ
		img=Tools.getImg("img/0.png");
		//��ĳ�ʼ����
		x=100;
		y=200;
		//��ȡ��Ŀ���
		w=img.getWidth()/2;
		h=img.getHeight()/2;
		//��ʼ��װͼƬ������
		list = new ArrayList<BufferedImage>();
		//������������ͼƬ
		list.add(Tools.getImg("img/0.png"));
		for (int i=0;i<8 ;i++ )
		{
			list.add(Tools.getImg("img/"+i+".png"));
		}
		//��ʼ�����ٶ�
		v0=5;
		//ʱ��(������ߵ�����Ҫ��ʱ��)
		t=0.2;
		//����
		s =0;
		//����
		g=2;

	}

	//��ĳ������
	int index =0;//����±�����ȡͼƬ
	public void fly(){
		//list.size()��ȡlist�е�Ԫ��������
		img = list.get(index%list.size());
		index++;
		/*if (index==7)
		{
			index=0;
		}*/

	}
	//С���һ�������˶�
	public void move(){
		//����С������׵ľ���
		s=v0*t;
		//�õ�С�����׺����ߵ��y���ꡣ
		y=y-(int)s;//y�����ͣ�s��double.ǿ������ת��
		//����С�񵽴���ߵ���ٶȣ�����ʱ�ĳ��ٶȣ�
		double v2=v0-g*t;
		v0=v2;
	}
	//С�������˶�
	public void moveUp(){
		v0=10;
	}
	
}