class Circle {
    private double radius = 0;
    public static int count =1;
    public Circle(double radius) {
        this.radius = radius;
    }
     
    class Draw {     //�ڲ���
        public void drawSahpe() {
            System.out.println(radius);  //�ⲿ���private��Ա
            System.out.println(count);   //�ⲿ��ľ�̬��Ա
        }
    }
}