 public class Email{
     //��������
     String address;
     String title;
     int group;
     //����һ��������
     public Email(String Email_address,String Email_title,int Email_group){
         address=Email_address;
         title=Email_title;
         group=Email_group;

     }
     //���õ�ַ����
     public void setAddress(String Email_address){
         address=Email_address;
     }
     //��ȡ����title
     public String getTitle(){
         return title;
     }
     //��ȡ��ַ
     public String getAddress(){
         return address;
     }
 }