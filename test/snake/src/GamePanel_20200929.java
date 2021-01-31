import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author : msb-zhaoss
 */
public class GamePanel extends JPanel {
    //���߶�Ӧ������x��������������У�
    int[] snakeX = new int[500];
    //���߶�Ӧ������y��������������У�
    int[] snakeY = new int[500];
    //�����ߵĳ��ȣ�
    int length;
    //����С�ߵ����߷���
    String dirction ;

    //������Ϸ��״̬��
    boolean isStart ;

    //����һ����ʱ����
    Timer timer;
    //����һ����ʼ���ķ�����������ʼ��С�ߵ����꣺
    public void init(){
        //��ʼ����ͷ�����꣺
        snakeX[0] = 150;
        snakeY[0] = 250;
        //��ʼ����һ�������ӣ�
        snakeX[1] = 125;
        snakeY[1] = 250;
        //��ʼ���ڶ��������ӣ�
        snakeX[2] = 100;
        snakeY[2] = 250;
        //��ʼ���ߵĳ��ȣ�
        length = 3;
        //��ʼ���ߵ����߷���
        dirction = "R";
        //��ʼ����Ϸ��״̬��
        isStart = false;//��Ϸ�ʼ��ʱ������ͣ��״̬��
    }
    public GamePanel(){
        init();
        //��������Ļ�Ľ����������ϣ�
        this.setFocusable(true);
        //�����������
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {//����������������Ƿ��������̰�ѹ��
                super.keyPressed(e);
                //��ȡ�㰴�İ����Ĵ��룺
                int keyCode = e.getKeyCode();
                System.out.println(keyCode);
                if(keyCode == 32){//���¿ո��
                    isStart = !isStart;
                    //ˢ��ҳ�棺
                    repaint();//paintComponent
                }
            }
        });

        //��ʼ����ʱ����
        timer = new Timer(100, new ActionListener() {
            //ÿ100���룬ִ��һ��actionPerformed��������ݣ�
            @Override
            public void actionPerformed(ActionEvent e) {
                //ÿ100���� �ı��ߵ����꣺
                if(isStart){//��Ϸ��ʼ��С������
                    //�ı��ߵ����꣺
                    //��һ���ߵ�ǰһ�ڣ�
                    //�������ߣ�
                    for (int i = length-1; i > 0 ; i--) {
                        snakeX[i] = snakeX[i-1];
                        snakeY[i] = snakeY[i-1];
                    }

                    //��ͷ�ٶ���
                    snakeX[0] = snakeX[0] + 25;

                    //ˢ��ҳ�棺
                    repaint();


                }
            }
        });

        //��ʱ������Ҫ����������
        timer.start();
    }

    //���������  ��ͼ���߼� ��Ӧ�ķ��� -�� ���л�ͼ���߼���д�����������
    //�������  �����Լ����� �ײ� �Զ�����
    @Override
    protected void paintComponent(Graphics g) {//Graphics g  ����
        super.paintComponent(g);
        //���������һ������ɫ��
        this.setBackground(new Color(194, 221, 239));
        //��һ��ˮӡͼƬ��
        Images.headerImg.paintIcon(this,g,10,10);
        //�ı仭�ʵ���ɫ��
        g.setColor(new Color(239, 219, 218));
        //����Ϸ����
        g.fillRect(10,70,770,685);

        //�ڶ�Ӧ������λ�� ���߶�Ӧ��ͼƬ�Ž�ȥ��
        //����ͷ��
        switch (dirction){
            case "U" : Images.upImg.paintIcon(this,g,snakeX[0],snakeY[0]);break;
            case "D" : Images.downImg.paintIcon(this,g,snakeX[0],snakeY[0]);break;
            case "L" : Images.leftImg.paintIcon(this,g,snakeX[0],snakeY[0]);break;
            case "R" : Images.rightImg.paintIcon(this,g,snakeX[0],snakeY[0]);break;
        }

        //�������ӣ�
        /*Images.bodyImg.paintIcon(this,g,snakeX[1],snakeY[1]);
        Images.bodyImg.paintIcon(this,g,snakeX[2],snakeY[2]);*/
        for (int i = 1; i < length; i++) {
            Images.bodyImg.paintIcon(this,g,snakeX[i],snakeY[i]);
        }

        //������Ϸ��״̬���ƣ�
        if(isStart == false){//��Ϸ��ͣ
            //�������һ�����֣�
            g.setColor(new Color(159, 123, 214));
            g.setFont(new Font("΢���ź�",Font.BOLD,40));
            g.drawString("����ո�ʼ��Ϸ",250,330);
        }
    }
}