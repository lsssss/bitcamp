/* 다른 소스 파일의 코드를 참조할 때 컴파일 하는 방법
- 다른 소스 파일의 코드를 참조할 때 컴파일 하는 방법을 알아보자!
- 다른 소스 파일의 코드를 불러오는 이유는
*/

class Test06{
    public static void main(String[] args){
        Test06_other.printHello();
    }
}

/* [일반적인 컴파일 방법]
   >javac -d bin -encoding UTF-8 src/main/java/Test06.java
*/