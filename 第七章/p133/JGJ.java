public class JGJ extends Wine{

	public JGJ(){
		setName("JGJ");
	}
	/**
	*	重写父方法，实现多态。
	
	public String drink(){
		return "喝酒就喝："+getName();
	}
	*/
	/**
	*	toString()方法。
	*/
	public String toString(){
		return "JGJ中的toString\t Wine:"+getName();
	}
}
