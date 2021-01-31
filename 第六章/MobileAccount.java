public class MobileAccount{
	private int accountId=0; //私有属性，只有类的成员才可以访问的属性
	public MobileAccount createAccount(){ //方法，返回值类型为MobileAccount类的对象。
		accountId++; //私有属性自加
		return this; //返回调用此方法的类
	}
	public int getAccountId(){ //方法，返回值为整型
		return accountId; //返回私有属性
	}
	public void setAccount(int accountId){  //方法，无返回值。参数整型，参数accountId与私有属性名字一样。
		this.accountId=accountId; //通过this引用区分这两个参数
	}
	public static void main(String[] args){ //主方法，静态的。
		MobileAccount account=new MobileAccount(); //创建类的对象account.
		System.out.println("帐号是："+account.createAccount().createAccount().getAccountId());//通过对象名引用对象的方法。
	}


}
//p104 引用对象本身。