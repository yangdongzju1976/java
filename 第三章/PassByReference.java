//引用调用。
public class PassByReference{

	private void printNumber(AddressBook b){//b:变量名
	b.number=20;
	System.out.println("printNumber()中的number="+b.number);
	}

	public static void main(String args[]){
		PassByReference p=new PassByReference();
		AddressBook a=new AddressBook();
		a.number=10;
		System.out.println("执行printNumber()之前main()中的number="+a.number);
		p.printNumber(a);
		System.out.println("执行printNumber()之后main()中的number="+a.number);
	}
}
class AddressBook
{
	//电话薄中的联系人数量
	public int number;
}