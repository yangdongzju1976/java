//���õ��á�
public class PassByReference{

	private void printNumber(AddressBook b){//b:������
	b.number=20;
	System.out.println("printNumber()�е�number="+b.number);
	}

	public static void main(String args[]){
		PassByReference p=new PassByReference();
		AddressBook a=new AddressBook();
		a.number=10;
		System.out.println("ִ��printNumber()֮ǰmain()�е�number="+a.number);
		p.printNumber(a);
		System.out.println("ִ��printNumber()֮��main()�е�number="+a.number);
	}
}
class AddressBook
{
	//�绰���е���ϵ������
	public int number;
}