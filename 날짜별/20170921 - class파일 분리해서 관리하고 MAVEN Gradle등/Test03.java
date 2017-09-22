// .class 클래스 파일 분리하기
// .class 파일을 관리하기 쉽도록 별도의 폴더로 분리 하는 방법을 알압 보자
// 왜 .class 파일을 소스파일로부터 분리 하는가?


class Test03 {
  public static void main(String[] args) {
    System.out.println("안녕하세요");
  }
}

/* 분리
 >javac -d [.clsass 파일을 저장할 폴더][소스파일명]
  예)
  >md bin (bin 폴더만들기) 
  >javac -d bin Test03.java
  
  이유: 소스파일과 클래스파일을 분리함으로써 
        소스파일을 관리하기 쉽고 배포를 위해 클래스 파일을 추출하기 쉽다.
  다른 폴더에 있는 클래스 실행하기
  >java -classpath[파일이 있는 폴더1;폴더2;폴더3] 클래스명
  >java -cp [파일이 있는 폴더1;폴더2;폴더3] 클래스명

  */