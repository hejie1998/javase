package test01;

public class T2 {
	   //Ա������ ��ʽ�������� ȫ��
	  //ʵ��������ʵ����������ܷ��ʵı���
	String name;
	boolean flag;
	double money;
	//��Щ����Ҫ�����ʵ����������Щ��������ɾ�̬����
	//��̬������ һ��ָ����Ա����������ԣ������׸ı�ģ�
	static int count;
	//��λ����
	static String dname;
	
	public static void main(String[] args) {
		//��main�����У���ʵ�������ķ��ʣ��������ȴ�������
        //ʵ��������
		T2 o1=new T2();
		//String��Ĭ��ֵ��null
		System.out.println(o1.name+","+o1.flag);
		o1.name="�¶�";
		o1.money=1000;
		o1.dname="����";
		count++;
		T2 o2=new T2();
		//String��Ĭ��ֵ��null
		System.out.println(o2.name+","+o2.flag);
		o2.name="�´�";
		o2.money=1005;
		count++;
		System.out.println("���ڵ�Ա�������ǣ�"+count);
		o1.dname="��������";
		System.out.println(o1.name+"-->"+o1.dname);
		System.out.println(o2.name+"-->"+o2.dname);
			
	}
	    

}
