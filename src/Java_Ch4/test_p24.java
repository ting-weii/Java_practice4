package Java_Ch4;
//109360127_�q�l�T��_�\�ʺ�
public class test_p24 {
	public static void main(String[] args) {
		Car car1 = new Car();
		
		car1.setCar(1234, 20.5);
		System.out.println(car1);
		
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
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��" +num+ "�T�o�q�]��" +gas);
	}
	
	public String toString()
	{
		String str1 = "����:" +num+ "�A�T�o�q:" +gas;
		return str1;
	}
}
*/