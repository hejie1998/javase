package test01;
/**
 * 
 * ��̬�����;�̬����������������ģ�
 * �������ǰѾ�̬���������������
 * ���ǰѾ�̬���������෽��
 * �����ǶԾ�̬�����;�̬�����ķ��ʹ���:
 * 1.����.��̬������
 * 2.����.��̬������   
 * 
 * this�ؼ����Ǵ��������ǰ���󣬲��ܹ��ھ�̬������ʹ�á�
 * 
 * 
 * @author lenovo
 *
 */
public class Wo {

	public static void main(String[] args) {
		Dog  dog1 =  new Dog();
		dog1.setColorName("��ɫ");
		//���Թ�ͷ�������������
		Dog.eat();
		
		System.out.println(dog1.getColorName());
		
		System.out.println("---------------");
		Dog  dog2=  new Dog();
		dog2.setColorName("���ɫ");
		Dog.eat();
		System.out.println(dog2.getColorName());

	}

}
