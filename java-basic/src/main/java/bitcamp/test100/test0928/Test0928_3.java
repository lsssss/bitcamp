// 사용자 정의 데이터 타입 class
// - 여러 종류의 데이터 타입을 가진 메모리를 묶어서 새로운 타입으로 만듬
// ex) 학생의 정보에 관한 데이터들을 한번에 묶을수 있음


package bitcamp.test100.test0928;

public class Test0928_3{
    public static void main(String[] args){

        class Stusc{
            String name;
            int mat;
            int kor;
            int eng;
            int sum;
            double avr;

            void compute() {
                sum = mat+kor+eng;
                avr = sum/3.0f;
            }

        }

        Stusc sc = new Stusc();
        sc.name = "이승서";
        sc.mat = 100;
        sc.kor = 100;
        sc.eng = 100;
        sc.compute();

        System.out.printf("%s,%d,%d,%d,%d,%.2f",sc.name,sc.mat,sc.kor,sc.eng,sc.sum,sc.avr);





    //    class Studentscore2{
    //         String name;
    //         int age;
    //    }

    //    Studentscore2 ssc1 = new Studentscore2();

    //    ssc1.name = "홍길동";
    //    ssc1.age = 30;



       
        // // 학생의 정보 데이터를 저장할 수 있는 새로운 메모리 구조를 정의
        // class Studentscore{
        //     String name;
        //     String addr;
        //     String tel;
        //     int age;
        //     int eng;
        //     int math;
        //     int kor;
        //     int sum;
        //     float aver;
        // }
        // // new Studentscore의 인스턴스 주소를 r1이라는 레퍼런스 변수에 저장한다 
        // Studentscore s1 = new Studentscore();
        // s1.name = "이승서";
        // s1.addr = "오산";
        // s1.tel = "010-8955-3210";
        // s1.age = 30;
        // s1.eng = 100;
        // s1.math = 100;
        // s1.kor = 100;
        // s1.sum = s1.eng+s1.kor+s1.math;
        // s1.aver = s1.sum/3.0f;

        // System.out.printf("%s,%s,%s,%d,%d,%d,%d,%d,%.2f",s1.name, s1.addr, s1.tel, s1.age, s1.eng, s1.math, s1.kor, s1.sum, s1.aver);

    }
}