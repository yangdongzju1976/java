import java.util.ArrayList;
import java.util.List;
public class StaticMethod {
	int i;
public static void main(String[] args) {
        System.out.println(test("aaaaa"));  //aaaaa  �����÷�
        System.out.println(test1("aa").get(0).equals("aa"));    //true  �����ڲ���װ
        System.out.println(test2("bbbbb")); //bbbbb   װ��Ū��
        
      
    }

    
   public static<T> T test(T obj){
		//i++; //��̬�������ܷ��ʷǾ�̬�����Ժͷ���
        return obj;
    }
	public <T> T test0(T obj){
	i++;//��ȷ���Ǿ�̬�ķ������Է���������ԡ�
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