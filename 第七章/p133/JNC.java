public class JNC extends Wine{

	public JNC(){
		setName("JNC");
	}
	/**
	*	重写父方法，实现多态。
	*/
	public String drink(){
		return "JNC_喝酒就喝："+getName();
	}
	/**
	*	重写父方法，实现多态 。toString()方法。
	*/
	public String toString(){
		return "JNC中的toString\t Wine:"+getName();
	}
}
