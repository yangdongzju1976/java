public class RuntimeDemo
{
	public static void main(String[] args) 
	{
		//��ȡRuntime����
		Runtime run=Runtime.getRuntime();
		System.out.println("���ڴ��С��"+run.totalMemory());
		System.out.println("������������"+run.availableProcessors());
		
	}
}
//Ӧ�ó�����ֱ�Ӷ�Runtime�����ʵ������������ͨ��getRuntime()������ȡ���
//���������Runtime�����������ʹ����˵�ǰ���г��������ʱ������ͨ���ö���
//���Է���JVM�������Ϣ���紦�����������ڴ���Ϣ�ȡ�
