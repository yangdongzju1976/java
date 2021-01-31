public class OpenGreetings{
    public static void  main(String[] args) {
        int day=20,month=5,year=2011;
        //以下三种标识符不合法
        // @day, 12abc, private
        OpenGreetings og=new OpenGreetings();
        og.theDate(day,month,year);
        
    }
    public void theDate(int theDay,int theMonth,int theYear){
        String greetings="Welcome To Android World~!";
        System.out.println("Today is "+theYear+"/"+theMonth+"/"+theDay+"\n"+greetings);

    }
}