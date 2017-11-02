// ## 메서드 - 용도의 사용 예
// - 메서드의 용도와 간단한 사용 예를 알아보자!
//

package bitcamp.practice100.practice1013;

public class Practice1012_6 {
    
    // > 문자열을 반환하는 메서드
    static String m1(String name, String name2) {
    	
    	String k = name+name2;
    	
        return k;
    }
    
    // > 숫자를 반환하는 메서드
    static int m2(int a, int b, int c) {
        
    	int sum = a+b+c;
    	
    	return sum;
    }
    
    // > 논리 값 반환하는 메서드
    static boolean m3() {
        return true;
    }
    
    // > 메서드에 선언된 리턴 타입과 실제 반환하는 데이터의 타입이 일치해야 한다.
    //   일치하지 않으면 컴파일 오류이다.
    //static int m4() {return "hello";} // 컴파일 오류! 
    //static int m5() {} // 컴파일 오류!
    
    // > return 명령을 수행하는 즉시 메서드 실행을 멈추고 호출한 데로 간다.
    //   따라서 return 명령 다음에 다른 명령을 작성해서는 안된다.
    static int m6() {
        return 100;
        //int a = 100; // 컴파일 오류!
        //a++; // 컴파일 오류!
    }
    
    public static void main(String[] args) {
        // 값을 반환하는 메서드 호출하기
        String v = m1("김김이","방방");
        System.out.println(v);
        // 반환 받은 값을 변수에 저장하지 않고 바로 사용할 수 있다.
        int k= m2(10,30,40);
        System.out.println(k);
//        System.out.println(m1());
        
        // 반환 값을 다루지 않아도 된다.
//        m1(); 
        // 반환 값을 저장하지 않으면 값은 버린다.
        
        // 반환 값의 타입과 다른 메모리에 저장할 수 없다.
        //String s = m2(); // 리턴 값은  int인데 String 변수에 저장하려 한다. 컴파일 오류!
        
    }
}
