// ## 메모리에 값 저장
// 메모리에 값을 저장하는 방법을 대해 자세히 알아보자!
//

package bitcamp.java100;

public class Test12_2 {

    public static void main(String[] args) {
// 메모리 준비하기
        int i;
        int j;

// 메모리에 값 저장하기
// '=' 연산자를 사용한다. 
// => '=' 연산자 왼편을 'l-value' 라 부른다. 반드시 메모리여야 한다.
// => '=' 연산자 오른편을 'r-value' 라 부른다. 메모리나 값이 될 수 있다. 
        i = 100; // r-value가 값인 경우
        j = i; // r-value가 변수인 경우
        System.out.println(i);
        System.out.println(j);

// => l-value에는 값이 올 수 없다.
        //100 = 200; // 컴파일 오류!

// => 메모리를 준비할 때 선언한 종류가 아닌 다른 종류의 값을 저장할 수 없다.
        //i = 3.14; // 컴파일 오류! 자바는 정적 타입 바인딩이다.

// => 메모리를 준비하지도 않고 사용할 수 없다.
        //x = 100; // "cannot find symbol" 컴파일 오류 발생!
    }
}


// ##메모리 준비 
// - 메모리를 준비할 때 어떤 종류의 값을 저장할 것인지 지정해야 한다.
// - 그리고 그 용도로만 사용할 수 있다.
// - 이것을 " 변수 선언" 이라 부른다.
// - 값 종류를 "데이터 타입"이라 부른다. 
// - 문법
//   [값 종류] 메모리이름;
//   [데이터타입] 변수명;
//
// ### 메모리와 데이터 타입
// 1)정적 타입 바인딩(static type binding)
// -메모리를 특정 용도로 묶어 놓는 것.
// -메모리를 준비할 때 그 메모리에 담을 값의 종류를 한번 결정하면,
//  다시 바꿀 수 없는 방식
// -java, c/c++ 등이 이에 해당한다.
// -메모리를 한가지 용도로 제한함으로써 유지보수할때 혼동을 줄이기 위함.
// => 변수를 잘못사용하는  경우를 줄임으로써 시스템의 안정성을 높이기 위함이다.

// 2)동적 타입 바인딩(dynamic type binding) 
// =메모리에 값을 넣을 때 그 메모리의 용도가 결정된다.
// -다른 종류의 값을 넣으면 그 메모리의 용도가 바뀐다.
// -보통 JavaScript, Phyton 등 스크립트류의 프로그래밍 언어에서 사용하는 방식이다.
//
//
//## 자바에서 제공하는 메모리 종류[데이터 타입]
// 1) 정수 값
// 2) 부동소수점 값
// 3) 논리 값
// 4) 주소 값