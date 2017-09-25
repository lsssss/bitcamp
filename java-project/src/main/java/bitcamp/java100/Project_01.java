
// ver 01
// -표준 출력장치로 인사 문구 출력하기




public class App {
    
        import java.util.Scanner;
    
        public static void main(String[] args) {
            
            int kor=100,eng=100,mat=100,avr=(kor+eng+mat)/3,tot=kor+eng+mat;
        
            System.out.print("이름 : ");
            System.out.println("홍길동");
            System.out.print("국어 : ");
            System.out.println(100);
            System.out.print("영어 : ");
            System.out.println(100);
            System.out.print("수학 : ");
            System.out.println(100);
            System.out.print("총점 : ");
            System.out.println(300);
            System.out.print("평점 : ");
            System.out.println(100.0);
            
            
            System.out.print("이름 : ");
            System.out.println("홍길동");
            System.out.print("국어 : ");
            System.out.println(kor);
            System.out.print("영어 : ");
            System.out.println(eng);
            System.out.print("수학 : ");
            System.out.println(mat);
            System.out.print("총점 : ");
            System.out.println(tot);
            System.out.print("평점 : ");
            System.out.println(avr);
            /*
            Scanner sc = new Scanner(System.in);
            System.out.print("국어 : ");
            double korsc = sc.nextInt();
            System.out.print(korsc);
            System.out.print("수학 : ");
            double matsc = sc.nextInt();
            System.out.print(matsc);
            System.out.print("영어 : ");
            double engsc = sc.nextInt();
            System.out.print(matsc);
            double totsc=korsc+matsc+engsc;
            double avrsc=totsc/3;
            System.out.print("총점 : ");
            System.out.println(totsc);
            System.out.print("평균 : ");
            System.out.println(avrsc);*/
        }
    }
    
    
    /*
        ver 02
        -학생 한 명의 성적 점수를 출력하라!
        -이름, 국어 영어 수학 총점 평균
        -예)
        이름: 이름 홍길동
        국어: 100
        영어: 100
        수학: 100
        총점: 300
        평균: 100.0
    
    */