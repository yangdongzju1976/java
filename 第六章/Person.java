public class Person{
	private String name;
	private int age;
	private String sex;
	public String showName(){ //方法，仅有，用于获得类的name属性。
		return this.name;
	}
	public void setName(String theName){//设置类的name属性。
		this.name=theName;//this可以不写.当参数名与属性名称一致的时候，必须写。比如theName定义成name的时候。
	}

}
//Person.java P103页。this关键字