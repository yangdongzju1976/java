 public class Email{
     //定义属性
     String address;
     String title;
     int group;
     //定义一个构造器
     public Email(String Email_address,String Email_title,int Email_group){
         address=Email_address;
         title=Email_title;
         group=Email_group;

     }
     //设置地址属性
     public void setAddress(String Email_address){
         address=Email_address;
     }
     //获取属性title
     public String getTitle(){
         return title;
     }
     //获取地址
     public String getAddress(){
         return address;
     }
 }