//����
 class Father{
//������һ�����ӷ���
	public void hitChild(){
		System.out.println("��Ҫ���ӣ�");
	}
}
//����1
 class Son1 extends Father{
//��д������ӷ���
	public void hitChild(){
		System.out.println("Ϊʲô���ң�������ʲô�ˣ�");
	}
	public void Cry(){
		System.out.println("�ҿ��ˣ�����");
	}
}
//����2
 class Son2 extends Father{
//��д������ӷ���
	public void hitChild(){
		System.out.println("��֪�����ˣ�����ˣ�");
	}
}
//����3
 class Son3 extends Father{
//��д������ӷ���
	public void hitChild(){
		System.out.println("���ܣ�����ţ�");
	}
}
 class Son4 extends Father{
//��д������ӷ���
	//public void hitChild(){
		//System.out.println("���ܣ�����ţ�");
	//}
}
//������
public class Test_Father{
	public static void main(String args[]){
		Father father;
	
		father = new Son1();
		father.hitChild();
		//father.Cry();  ��ģ�����û������������������ò��ܵ��ø���û�еķ�����
	
		father = new Son2();
		father.hitChild();
	
		father = new Son3();
		father.hitChild();

		father = new Son4();//���������û����д�������������ø����еķ�����
		father.hitChild();
	}
}
/*
Java��û�ж�̳У�һ����֮����һ�����ࡣ���̳еı��־��Ƕ�̬��һ����������ж�����࣬
���������������д����ķ��������緽��print()��������ÿ����������д�Ĵ��벻һ����
��Ȼ������ʽ�Ͳ�һ���������ø���ı���ȥ���ò�ͬ�����࣬�ڵ��������ͬ�ķ���print()��ʱ��
�õ��Ľ���ͱ�����ʽ�Ͳ�һ���ˣ�����Ƕ�̬����ͬ����Ϣ��Ҳ���ǵ�����ͬ�ķ��������в�ͬ�Ľ��.

����������ͬ�ķ����������˲�ͬ�Ľ��������Ƕ�̬�ı��֣�

 ����һ���������͵�����ָ��һ������Ķ���ȿ���ʹ������ǿ��Ĺ��ܣ��ֿ��Գ�ȡ����Ĺ��ԡ�

���ԣ��������͵����ÿ��Ե��ø����ж�����������Ժͷ����������������ж����������û�еķ����������޿��κεģ�

���ڸ����ж���ķ����������������д�˸÷�������ô�������͵����ý�����������е��������������Ƕ�̬���ӡ�
*/