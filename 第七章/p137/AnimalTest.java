public class AnimalTest {

    private final String ANIMAL = "����";

    public void accessTest() {
        System.out.println("�����ڲ���������ⲿ�෽��");
    }

    class Animal {
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        public void printAnimalName() {
            System.out.println(bird.name);
        }
    }

    // ���࣬�������࣬�̳���Animal�࣬���Ը�д���෽��
    Animal bird = new Animal("������") {

        @Override
        public void printAnimalName() {
			accessTest(); // �����ⲿ���Ա
			System.out.println(ANIMAL);  // �����ⲿ��final���εı���
            super.printAnimalName();
        }
    };

    public void print() {
        bird.printAnimalName();
    }

    public static void main(String[] args) {

        AnimalTest animalTest = new AnimalTest();
        animalTest.print();
    }
}