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
		return "�ȵ��ǣ�"+getName();
	}
	/*
		��дtoString. toString�ǻ�����object�ķ�����object��������ĸ���
	*/
	public String toString(){
		return  "tostring \t wine";
	}
	
}