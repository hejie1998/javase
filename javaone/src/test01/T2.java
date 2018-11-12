package test01;

public class T2 {
	   //员工姓名 隐式：作用域 全局
	  //实例变量，实例化对象才能访问的变量
	String name;
	boolean flag;
	double money;
	//有些变量要定义成实例变量，有些变量定义成静态变量
	//静态变量（ 一般指所有员工共享的属性，不轻易改变的）
	static int count;
	//单位名字
	static String dname;
	
	public static void main(String[] args) {
		//在main方法中，对实例变量的访问，必须首先创建对象
        //实例化对象
		T2 o1=new T2();
		//String的默认值是null
		System.out.println(o1.name+","+o1.flag);
		o1.name="陈二";
		o1.money=1000;
		o1.dname="阳光";
		count++;
		T2 o2=new T2();
		//String的默认值是null
		System.out.println(o2.name+","+o2.flag);
		o2.name="陈大";
		o2.money=1005;
		count++;
		System.out.println("现在的员工数量是："+count);
		o1.dname="阳光体育";
		System.out.println(o1.name+"-->"+o1.dname);
		System.out.println(o2.name+"-->"+o2.dname);
			
	}
	    

}
