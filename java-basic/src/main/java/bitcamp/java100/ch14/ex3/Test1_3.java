// 데이터 프로세싱 스트림 클래스 사용법 - int 메모리의 값 모두 출력하기
// 
package bitcamp.java100.ch14.ex3;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Test1_3 {
    public static void main(String[] args) throws Exception {
        
        // 다음 데이터를 출력해보자!
        // 조건: 국,영,수 각각의 만점은 1000점이다.
        Score s = new Score("홍길동", 800, 900, 1000);
        
     
        
        
        DataOutputStream out = new DataOutputStream( new FileOutputStream("test4.dat"));
        
        
        out.writeUTF(s.getName());
        out.writeInt(s.getKor());
        out.writeInt(s.getEng());
        out.writeInt(s.getMath());
        
        // 이름을 출력하기 전에 몇바이트를 출력하는지
        // 먼저 그 값을 출력해야 한다.
        out.close();
        
        System.out.println("출력을 완료했습니다.");
    }
}











