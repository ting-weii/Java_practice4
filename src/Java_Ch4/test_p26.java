package Java_Ch4;
//109360127_�q�l�T��_�\�ʺ�
public class test_p26 {
	public static void main(String[] args) {
		Car[] cars = new Car[2];
		
		cars[0] = new Car();
		cars[1] = new RacingCar();
		
		for(int i=0; i<cars.length ;i++)
		{
			Class cl = cars[i].getClass();
			System.out.println("��" +(i+1)+ "�Ӫ������O�O" +cl);
		}

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
		System.out.println("�Ͳ��F���l");
	}
}

class RacingCar extends Car
{
	public RacingCar()
	{
		System.out.println("�Ͳ��F�ɨ�");
	}
}*/