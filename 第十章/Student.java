public class Student<T1,T2>{
    private T1 javaScore;
    private T2 oracleScore;
    //��������ʱ����ʹ�þ�̬����|��̬����
    //private static T1 test;
    
    public T1 getJavaScore(){
        return javaScore;
    }
    
    public void setJavaScore(T1 javaScore){
        this.javaScore = javaScore;
    }
 
    public T2 getOracleScore() {
	return oracleScore;
	}
 
    public void setOracleScore(T2 oracleScore) {
	this.oracleScore = oracleScore;
    }
 
    
    public static void main(String[] args){
    //ʹ��ʱָ������(��������)
    Student<String,Integer> stu = new Student<String,Integer> ();
    //1.��ȫ�����ͼ��
    stu.setJavaScore("����");
	stu.setOracleScore(100);
    //2.ʡ�ģ�����ת��
  //  int it = stu.getOracleScore();  //�Զ�����
  System.out.println("java:"+stu.getJavaScore());
    } 
 
}