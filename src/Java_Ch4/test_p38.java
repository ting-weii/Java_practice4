package Java_Ch4;
//109360127_電子三甲_許廷維
public class test_p38 {
	public static void main(String[] args) {
		Vehicle[] vc = new Vehicle[2];
		
		vc[0] = new Car(1234,20.5);
		vc[1] = new Plane(232);
		
		System.out.println("--------------------------");
		for(int i=0; i<vc.length ;i++)
		{
			vc[i].show();
		}
	}	
}
/*
interface Vehicle
{
	int weight = 1000;
	void show();
}

class Car implements Vehicle
{
	private int num;
	private double gas;
	
	public Car(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為" +num+ "汽油量為" +gas+ "的車子");
	}
	
	public void show()
	{
		System.out.println("車號是:" +num);
		System.out.println("汽油量是:" +gas);
	}
}

class Plane implements Vehicle
{
	private int flight;
	
	public Plane(int f)
	{
		flight = f;
		System.out.println("生產了" +flight+ "班次的飛機");
	}
	
	public void show()
	{
		System.out.println("飛機的班次是" +flight);
	}
}
*/