package test01;

public class T4 {
//在这个类中想调用t3的变量，为了安全起见，不能直接调用，太随意不安全，要给t3中的变量封装，即private（私有），
	public static void main(String[] args) {
	T3 t1=new T3();
	t1.setAge(600);
	t1.setName("李达");
	System.out.println("姓名为："+t1.getName()+"年龄："+t1.getAge());

	}
}
