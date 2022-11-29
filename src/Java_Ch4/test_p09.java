package Java_Ch4;
//109360127_電子三甲_許廷維
public class test_p09 {
	public static void main(String[] args) {
		RacingCar rccar1 = new RacingCar();
		
		rccar1.RacingCarShow();
		System.out.println("--------------------------");
	}	
}
/*
class Car
{
	protected int num;
	protected double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
}

class RacingCar extends Car
{
	private int course;
	
	public RacingCar()
	{
		course = 0;
		System.out.println("生產了賽車");
	}
	
	public void RacingCarShow()
	{
		System.out.println("賽車的車號是:" +num);
		System.out.println("汽油量是:" +gas);
		System.out.println("賽車編號是:" +course);
	}
}
*/