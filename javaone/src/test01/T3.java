package test01;

public class T3 {
	//��װ��дprivate��˽�У���Ϊ�˱���������еı������ݲ�������������ֱ�Ӹ�ֵ������ͨ���������������ݵ�����
	private String name;
	private int age;
	static String cityName;//staticΪ��̬��������ȫ��Ĭ�ϱ���������һ��ֵ����ȫ��Ĭ�϶������ֵ
	public String getName() {
		return this.name;
	}
	//this����д��static�ľ�̬������
	public void setName(String name) {
		this.name = name;
	}
	//��ȡֵ
	public int getAge() {//��ȡֵȻ�󷵻�T4
		if (this.age>0&&age<450){
			return this.age;
		} else {
          return 0;
		}
		
	}
	//����ֵ�������ú��ȡ��
	public void setAge(int age) {//���int age��T4д��setage()�����ֵ��������this.age
		if (age>0&&age<=450) {
			this.age = age;
		}
		else{
			System.out.println("������䲻�Ϸ�");
		}
	}
	public static void main(String[] args) {
		
		
	}
	

}
