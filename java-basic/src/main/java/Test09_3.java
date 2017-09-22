/* 클래스와 패키지
- 패키즈를 사용하여 클래스를 분류하는 방법을 알아보자!
*/

// 소스 파일에서 제일 처음에 패키지를 선언한다.
// 그러면 이후에 선언되는 모든 클래스들은 이 패키지에 소속된다


package a.b.c; //하위 패키지는점(.)으로 구분한다.
public class Test09_3 {
      public static void main(String[] ags) {
        System.out.println("hello");    
  }  
}

/* [패키지 소속 클래스]
 * - 위와 같이 특정 패키지에 소속된 클래스를 말한다.
 * - 컴파일러는 패키지 클래스를 컴파일 할 때
 * - 패키지에 해당하는 폴더를 자동 생성한다.
 * - c# c++ 은 namespace라고 한다 
 * - namespace=package
 * - 패키지 사용 이유는 단순히 코드의 관리를 쉽게 하기 위해서다
 * 
 * [패키지 클래스를 실행하는 방법]
 * 1)패키지 무소속 클래스
 *    >java -cp build\classes\java\main Test09_1
 * 2)패키지 소속 클래스
 *  패키지명을 포함하여 클래스명을 지정한다
 *    >java -cp build\classes\java\maun a.Test09_2
 * 3)CLASSPATH 등록후 실행하기
 *    (Window)
 *    >set CLASSPATH=현재 위치에서 실행할.class파일이 있는 폴더 위치 
 *    (linux&unix)
 *    >export CLASSPATH=현재위치에서./ 실행할 .class파일이 있는 폴더 위치 
 * [주의]
 * -패키지를 클래스를 실행할 때 패키지 이름까지 포함해야 한다.
 * -cp "-cp" 또는 "-classpath"에 패키지명까지 포함해봐야 소용없다.
 * 예)
 *  >java -cp build\classes\java\main\a Test09_2 <==실행 오류!
 * 
 */
