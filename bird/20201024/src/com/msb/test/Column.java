
package src;
import java.awt.image.*;//BufferedImage
import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Random;
public class  Column
{
	//���ӵ�ͼƬ
	BufferedImage img;
	//���ӵ�����
	int x;
	int y;
	//���ӵĿ��
	int w;
	//���ӵĸ߶�
	int h;
	//���Ӽ��
	int distance;
	//�����������
	Random r=new Random();


	//��������ʼ���������Ӷ���

	public Column(int i){ //i:��ʾ�ڼ������ӡ����
		//��ʼ������ͼƬ��
	
			img=Tools.getImg("img/column.png");//��ͼƬ�������bg
		//��ȡͼƬ�Ŀ��
		//���̫�������޸Ĳ����������2�������������ô��
		w=img.getWidth()/2;
		//��ȡͼƬ�ĸ߶�
		h=img.getHeight()/2;
		distance=245;
		//������������
		//����ͨ���޸�����ֵ�ı����ӵ�λ�á�
		/*x=300;
		y=-26;
		//��ʼ�����Ӽ��
		
		*/
		/*switch (i)
		{
		case 1:x=300; break;
		case 2:x=545; break; 
		
		}
		*/
		x=300 + (i-1)*245;
		y=-1*r.nextInt(29);//��С-28�����0
	}
	public void move(){
		
		if (x<-1*w)
		{
			x=300+distance;
			y=-1*r.nextInt(29);
					//System.out.println("y="+y);

		}
		x--;
	}

}
