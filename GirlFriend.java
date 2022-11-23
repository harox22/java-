public class GirlFriend{
	//属性
	private String name;
	private int age;
	private String gender;

	//行为
	public void sleep(){
		System.out.println("女朋友在睡觉");
	}

	public void eat(){
		System.out.println("女朋友在吃东西");
	}

	//setter赋值
	public void setAge(int a){
		if (a>=18 && a <=50){
			age = a;
		}else{
			System.out.println("非法数据");
		}
	}	

	//getter获取值
	public int getAge(){
		return age;
	}	
}