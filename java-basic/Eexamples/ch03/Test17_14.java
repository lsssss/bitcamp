// ##메서드  call by value 와 call by reference
// -- call by value 와 call by reference의 차이점을 알아보자!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//

package bitcamp.java100;

public class Test17_14 {
	
	// ### call by value
	// -  메서드를 호출할때 값을 넘긴다.
	// - 호출자의 로컬 변수의 값을 변경할 수 없다.
	
	static void swap(int a, int b) {
		
		int temp;
		
		temp = a;
		a = b;
		b= temp;
		System.out.printf("swap() : a = %d , b = %d\n",a,b);
		
	}
	// ### call by reference
	// - 메서드를 호출할 떄 메모리의 주소를 넘긴다.
	// - 메서드에서 호출자의 메모리 값을 변경할 수 있다.
	
	static void swap2(int[] r) {
		int temp = r[0];
		r[0] = r[1];
		r[1] = temp;
		
		System.out.printf("swap() r[0] = %d ,r[1] = %d\n",r[0] ,r[1] );
	}
	
	
    
    public static void main(String[] args) {
    	int a = 5;
    	int b = 7;
    	
    	// 호출할 떄 값을 넘기는 예
    	// => call by value라 부른다.
    	swap(a,b);
    	
    	System.out.printf("a = %d ,b = %d\n",a ,b );
    	
    	// 호출할 때 메모리 주소를 넘기는 예 :
    	// => call by reference라 부른다.
    	
    	//C의 경우
    	//swap2(&a , &b);
    	
    	
    	int[] arr = new int[2];
    	arr[0] = 5;
    	arr[1] = 7;
    	
    	System.out.printf("before swap2() arr[0] = %d ,arr[1] = %d\n",arr[0] ,arr[1] );
    	
    	swap2(arr);
    	
    	System.out.printf("after swap2() arr[0] = %d ,arr[1] = %d\n",arr[0] ,arr[1] );
    }
}














