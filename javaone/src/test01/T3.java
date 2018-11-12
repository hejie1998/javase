package test01;

public class T3 {
	//封装，写private（私有）是为了保护这个类中的变量数据不会在其他类中直接赋值，必须通过方法来进行数据的设置
	private String name;
	private int age;
	static String cityName;//static为静态变量，即全局默认变量，给他一个值，即全局默认都是这个值
	public String getName() {
		return this.name;
	}
	//this不能写在static的静态环境中
	public void setName(String name) {
		this.name = name;
	}
	//获取值
	public int getAge() {//获取值然后返回T4
		if (this.age>0&&age<450){
			return this.age;
		} else {
          return 0;
		}
		
	}
	//设置值（先设置后获取）
	public void setAge(int age) {//这个int age是T4写的setage()里面的值，把它给this.age
		if (age>0&&age<=450) {
			this.age = age;
		}
		else{
			System.out.println("你的年龄不合法");
		}
	}
	public static void main(String[] args) {
		
		
	}
	

}
