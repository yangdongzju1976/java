/*
��������ָû���������ڲ��࣬�����ڴ���ʱʹ�� new ����������ࡣ���﷨��ʽ���£�

new <���ӿ�>() {
    // �������
};
������ʽ�� new �������һ���µ������࣬����һ���������������չ������ʵ��һ�������Ľӿڡ�
ʹ���������ʹ������Ӽ�ࡢ���գ�ģ�黯�̶ȸ��ߡ�
*/

class person{

    public void method(){
        System.out.println("���෽��");
    }
	public void a(){}
	public void a(int i){}

}



public class Anonymous_inner_class {
    public static void main(String[] args) {
        person p = new person(){//�����ڲ��ࡣû�ж�����(û������)��ֻ�Ǵ�����һ��������ѡ�
            @Override
            public void method() {
                System.out.println("��д���෽��");
			
            }
			public void a(){  //ֻ����д���෽�����������ظ�������
				System.out.println("a����");
			}
			public void a(int i){
				for (int j=0;j<i ;j++ )
				{
					System.out.printf("j=%d\n",j);
				}
			}
        };
        p.method();
		p.a(5);
		p.a();

    }
}

