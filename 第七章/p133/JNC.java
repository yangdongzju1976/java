public class JNC extends Wine{

	public JNC(){
		setName("JNC");
	}
	/**
	*	��д��������ʵ�ֶ�̬��
	*/
	public String drink(){
		return "JNC_�Ⱦƾͺȣ�"+getName();
	}
	/**
	*	��д��������ʵ�ֶ�̬ ��toString()������
	*/
	public String toString(){
		return "JNC�е�toString\t Wine:"+getName();
	}
}
