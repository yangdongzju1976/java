class Food{//����һ����
	 private String food_name; //���ԣ�˽�У��ַ���
    public String getFood_name(){ //����������ֵ����--�ַ���
        return food_name;
    }
    public void setFood_name(String foodName){ //��������������foodname,ͨ����������
        food_name=foodName;
    }
	public Food(String name){
		this.food_name=name;
	}
	public Food(){}

}