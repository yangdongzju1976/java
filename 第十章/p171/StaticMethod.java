import java.util.ArrayList;
import java.util.List;
public class StaticMethod {
	int i;
public static void main(String[] args) {
        System.out.println(test("aaaaa"));  //aaaaa  基本用法
        System.out.println(test1("aa").get(0).equals("aa"));    //true  用于内部包装
        System.out.println(test2("bbbbb")); //bbbbb   装神弄鬼
        
      
    }

    
   public static<T> T test(T obj){
		//i++; //静态方法不能访问非静态的属性和方法
        return obj;
    }
	public <T> T test0(T obj){
	i++;//正确，非静态的方法可以访问类的属性。
	return obj;
	}

    public static<T> List<T> test1(T obj){
        List<T> list = new ArrayList<>();
        list.add(obj);
        return list;
    }

   

    public static<T, A, B, C, D> B test2(B obj){
        return obj;
    }

}