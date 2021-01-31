public class Student<T1,T2>{
    private T1 javaScore;
    private T2 oracleScore;
    //泛型声明时不能使用静态属性|静态方法
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
    //使用时指定类型(引用类型)
    Student<String,Integer> stu = new Student<String,Integer> ();
    //1.安全：类型检查
    stu.setJavaScore("优秀");
	stu.setOracleScore(100);
    //2.省心：类型转换
  //  int it = stu.getOracleScore();  //自动拆箱
  System.out.println("java:"+stu.getJavaScore());
    } 
 
}