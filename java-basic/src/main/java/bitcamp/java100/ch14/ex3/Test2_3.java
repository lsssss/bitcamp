// 데이터 프로세싱 스트림 클래스 사용법 - DataInputStream 사용하기
// 
package bitcamp.java100.ch14.ex3;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Test2_3 {
    public static void main(String[] args) throws Exception {
        
        // 성적 데이터를 읽어보자!
        Score s = new Score();
        
        DataInputStream in = new DataInputStream(new FileInputStream("test3.dat"));
        
        s.setName(in.readUTF());
        s.setKor(in.readInt());
        s.setEng(in.readInt());
        s.setMath(in.readInt());

        in.close();
        
        System.out.println(s);
    }
}

// 데이터를 진짜로 읽는건 싱크 클래스
// 중간에서 읽고 쓰는걸 정의해주는 클래스를 데이터 프로세싱 스트림 클래스










