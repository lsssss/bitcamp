package bitcamp.java100.ch07.ex2;

public class Test2 {

	
	public static void main(String[] args) {
		ClaculatorA calc = new ClaculatorA();
		
		calc.plus(10);
		calc.plus(20);
		calc.minus(7);
		calc.multiple(2);
		calc.divide(3);
		
		System.out.println(calc.result);
		
	}
}
