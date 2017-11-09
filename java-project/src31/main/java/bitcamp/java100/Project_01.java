package bitcamp.java100;


public class Project_01{
    
        public static void main(String[] args){
            
            int kor=100,eng=12,mat=100,tot=kor+eng+mat;
            float avr=(kor+eng+mat)/3.0f;
            String name="홍길동"; 
            
            System.out.printf("이름 :%s\n", name);
           // System.out.println(name);
            System.out.printf("국어 : %d\n", kor);
           // System.out.println(kor);
            System.out.printf("영어 : %d\n", eng);
           // System.out.println(eng);
            System.out.printf("수학 : %d\n", mat);
           // System.out.println(mat);
            System.out.printf("총점 : %d\n", tot);
            //System.out.println(tot);
            System.out.printf("평점 : %.1f\n", avr);
            //System.out.println(avr);
        
            int i;
            String[] names ={"홍길동","이승서","김길동"};
            //print()
            //=> 출력한 이후에 줄바꿈 기호가 붙지 않는다
            for(i=0;i<3;i++){
             System.out.printf("이름 : %s\n", names[i]);
         
                        
            
         }
            
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