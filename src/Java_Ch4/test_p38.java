package Java_Ch4;
//109360127_�q�l�T��_�\�ʺ�
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
		System.out.println("�Ͳ��F������" +num+ "�T�o�q��" +gas+ "�����l");
	}
	
	public void show()
	{
		System.out.println("�����O:" +num);
		System.out.println("�T�o�q�O:" +gas);
	}
}

class Plane implements Vehicle
{
	private int flight;
	
	public Plane(int f)
	{
		flight = f;
		System.out.println("�Ͳ��F" +flight+ "�Z��������");
	}
	
	public void show()
	{
		System.out.println("�������Z���O" +flight);
	}
}
*/