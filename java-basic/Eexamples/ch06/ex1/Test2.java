// 클래스 문법의 용도 - 사용자 정의 데이터 타입 만들기
package bitcamp.java100.ch06.ex1;

// 클래스 문법 사용 
public class Test2 {
    public static void main(String[] args) {
        // 학생의 성적 정보를 저장할 변수를 준비하라!
        //
        // 1) 새 설계도에 따라 준비된 메모리의 주소를 저장할 변수 선언
        // => 이렇게 주소를 저장하는 변수를 "레퍼런스"라고 부른다.
        Score score;
        
        // 2) 새 설계도에 따라 메모리 준비하기
        // => 이렇게 준비된 메모리를 "인스턴스" 또는 "객체"라고 부른다.
        // => 메모리를 준비했으면 사용할 수 있도록 레퍼런스에 주소를 저장해야 한다.
        // => new 연산자를 통해 준비된 메모리는 "힙(heap)"이라 불리는 영역에 존재한다.
        // => 로컬 변수와 달리 메서드 호출이 끝나도 힙에 계속 존재한다.
        // => 언제까지? 가비지가 되어 가비지 컬렉터에 의해 제거될 때까지!
        score = new Score();
        
        
        
        // 학생의 성적 정보를 저장하라!
        // => 인스턴스의 각 항목에 값을 저장하려면, 레퍼런스를 이용해야 한다.
        // => 다음과 같이 인스턴스 주소를 갖고 있는 레퍼런스를 사용하여
        //    인스턴스에 접근한 다음에 그 인스턴스의 각 변수에 값을 저장한다.
        // => 문법: 레퍼런스명.인스턴스의각변수명 = 값;
        //
        score.name = "홍길동";
        score.kor = 100;
        score.eng = 100;
        score.math = 100;
        
        // 학생의 성적 데이터를 계산하라!
        // => 기존의 연산자(+, /)를 사용하여 성적 데이터를 계산한다.
        score.sum = score.kor + score.eng + score.math;
        score.aver = score.sum / 3f;
        
        
    }
}




