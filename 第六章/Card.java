public class Card{
	String name;
	String sex;
	String tele;
	public Card(){
		//System.out.println("Card()被调用");
	}
	public Card(String theName){
		this();
		this.name=theName;
		//System.out.println("Card(String theName)被调用");
	}
	public Card(String theName,String theTele,String theSex){
		this(theName);
		this.sex=theSex;
		this.tele=theTele;

		//System.out.println("Card(String theName,String theTele,String theSex)被调用");
	}
	 void Output(Card c){
		System.out.println("姓名："+c.name+"\t电话:"+c.tele+"\t姓别:"+c.sex);
	}
	public static void main(String[] args){
		Card c=new Card("ZhangShan","13013988870","男");
		c.Output(c);
	}
}