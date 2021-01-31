public class Wine{
	private String name;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public Wine(){
	}
	public String drink(){
		return "喝的是："+getName();
	}
	/*
		重写toString. toString是基础类object的方法。object是所有类的父类
	*/
	public String toString(){
		return  "tostring \t wine";
	}
	
}