// .java 소스 파일 분리하기
// .java 소스 파일을 관리하기 쉽도록 별도의 폴더로 분리 하는 방법을 알압 보자


class Test04 {
  public static void main(String[] args) {
    System.out.println("안녕하세요 Test04입니다2");
  }
}

/* 분리
 >javac -d [.clsass 파일을 저장할 폴더][폴더명/../소스파일명]
  예)
  >md src (폴더만들기) 
  >javac -d bin src/Test04.java
  
  이유: 소스 파일을 관리 보다 쉽게 관리하기 위함
  */