import java.io.*;

class MyException extends Exception { //�����Զ����쳣��
 String message; //����String���ͱ���
 public MyException(String ErrorMessagr) {  //���෽��
       message = ErrorMessagr;
 }
 public String getMessage(){   //����getMessage()����
  return message;
 }
}
public class Captor { //������
static int quotient(int x,int y) throws MyException{//���巽���׳��쳣
if(y < 0){  //�жϲ����Ƿ�С��0
         throw new MyException("���������Ǹ���");//�쳣��Ϣ
 }
 return x/y;//����ֵ
 }
public static void main(String args[]){ //������
 try{ //try���������ܷ����쳣�����
                int result = quotient(3,-2);//���÷���quotient()
    }catch (MyException e) { //�����Զ����쳣
  System.out.println(e.getMessage()); //����쳣��Ϣ
  }
    catch (ArithmeticException e) {
                   //����ArithmeticException�쳣
  System.out.println("��������Ϊ0");//�����ʾ��Ϣ
  }
   catch (Exception e) { //���������쳣
  System.out.println("���������������쳣");
                  //�����ʾ��Ϣ
  }
 }
}