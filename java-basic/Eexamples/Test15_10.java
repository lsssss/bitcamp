// ## 연산자 - 비트 연산자 (&, |, ~, ^)
// - 비트 연산자의 사용법을 알아보자!
//

package bitcamp.java100;

public class Test15_10 {

    public static void main(String[] args) {
        int v1 = 0b0101_1100;
        int v2 = 0b0110_0110;
        
// &(논리곱 AND)
// => 각 비트끼리 AND 연산을 수행한다. 둘 다 1일 때만 결과는 1이 된다.
        int result = v1 & v2;
        System.out.println(java.lang.Integer.toBinaryString(result));
// |(논리합 or)
// => 각 비트끼리 or 연산을 수행한다. 둘 중 하나만 1이어도 결과는 1이 된다.
        
        result = v1 | v2;
        System.out.println(java.lang.Integer.toBinaryString(result));
        
//  ^(배타적 논리곱 xor)
// => 각 비트끼리 xor 연산을 수행한다. 각 비트가 다를떄만 결과가 1이된다 
        result = v1 ^ v2;
        System.out.println(java.lang.Integer.toBinaryString(result));
// ~(부정 논리 부정 NOT)
// => 비트의 값을 반대 값으로 바꾼다      
        result = ~v1;
        System.out.println(java.lang.Integer.toBinaryString(result));
        
    }
}







