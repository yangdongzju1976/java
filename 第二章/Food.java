class Food { //定义一个类
    private String food_name; //属性：私有，字符串
    public String getFood_name(){ //方法：返回值类型--字符串
        return food_name;
    }
    public void setFood_name(String foodName){ //方法：设置属性foodname,通过参数传递
        food_name=foodName;
    }

}