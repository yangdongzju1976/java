public class MobileAccount{
	private int accountId=0; //˽�����ԣ�ֻ����ĳ�Ա�ſ��Է��ʵ�����
	public MobileAccount createAccount(){ //����������ֵ����ΪMobileAccount��Ķ���
		accountId++; //˽�������Լ�
		return this; //���ص��ô˷�������
	}
	public int getAccountId(){ //����������ֵΪ����
		return accountId; //����˽������
	}
	public void setAccount(int accountId){  //�������޷���ֵ���������ͣ�����accountId��˽����������һ����
		this.accountId=accountId; //ͨ��this������������������
	}
	public static void main(String[] args){ //����������̬�ġ�
		MobileAccount account=new MobileAccount(); //������Ķ���account.
		System.out.println("�ʺ��ǣ�"+account.createAccount().createAccount().getAccountId());//ͨ�����������ö���ķ�����
	}


}
//p104 ���ö�����