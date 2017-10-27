package java100.app;

public class Test {

	public static class Car{
		String name;
		int speed;
	}
	

	
	public static void main(String[] args) {
		
		
		Car[] cars = new Car[100];
		
		
		cars[0] = new Car();
	
		cars[0].name = "asd";
		System.out.printf("%s,\n",cars[0].name);
		cars[1] = new Car();
		cars[1].speed = 100;
		
		System.out.printf("%s, %d",cars[0].name,cars[1].speed);
		
		
		
		
	}
}
