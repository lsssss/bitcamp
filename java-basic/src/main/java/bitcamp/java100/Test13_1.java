package bitcamp.java100;

public class Test13_1{

    public static void main(String[] args) {
        // 배열 사용 전:
        // => 국어, 영어, 수학, 사회, 과학, 도덕, 중국어 점수를 저장할 변수를 만들라

        int kor, eng, mat, soc, sci, eth, chi;
        kor = 100;
        eng = 100;
        mat = 100;
        soc = 100;
        sci = 100;
        eth = 100;
        chi = 100;

        // 배열 사용 후
        
        int[] scores =new int[7];
        scores[0] = 100; 
        scores[1] = 100;
        scores[2] = 100;
        scores[3] = 100;
        scores[4] = 100;
        scores[5] = 100;
        scores[6] = 100;

        // 이렇게 배열을 사용하면 같은 종류의 메모리를 손쉽게 여러 개 만들 수 있다.
        // 여기에 for() 반복문을 결합하면 변수의 값을 다루기 더욱 쉬워진다.

        
        
    }
}