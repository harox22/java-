public class GirlFriendTest{
	public static void main(String[] args){
		//创建对象
		GirlFriend gf1=new GirlFriend();

		gf1.name="小诗诗";
		gf1.gender="小可爱";
		gf1.age=18;
		
		//对象属性：
		System.out.println(gf1.name);
		System.out.println(gf1.age);
		System.out.println(gf1.gender);
		
		//对象行为
		gf1.eat();
		gf1.sleep();
		
	}

}