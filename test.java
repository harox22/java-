//10-3-例子讲解，开始和结束接口，Comparable接口的使用

//https://www.bilibili.com/video/BV1Dz4y1o7FC/?spm_id_from=333.337.search-card.all.click&vd_source=f3753f1e3db6ac613a9fcf6045538e37

//做个接口Startstop
interface StartStop{
	public void start();

	public void stop();
}

//做个Meeting class
class Meeting implements StartStop{
	public void start(){
		System.out.println("会议开始");
	}

	public void stop(){
		System.out.println("会议结束");
	}
}

//再做个driving class
class Driving implements StartStop{
	public void start(){
		System.out.println("开车")；
	
	public void stop(){
		System.out.println("停车")；
		}
	}
}

//做个测试类
public class StartStopTest{
	public static void main(String[] args){
		Startstop s[];
	}
}







