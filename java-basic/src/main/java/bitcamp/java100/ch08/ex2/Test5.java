// 다형성(polymorphism) - 다형적 변수의 활용

package bitcamp.java100.ch08.ex2;

import java.io.File;

public class Test5 {

    public static void main(String[] args) throws Exception {

    	Object[] arr = new Object[100];
    	
    	
    	
    	arr[0] = new String("Hello");
    	arr[1] = Integer.valueOf(100);
    	arr[2] = new File("./build.gradle");
    	
    	Car c1 = new Truck();
    	Car c2 = new Sedan();
    	
    	
    	
    }

}










