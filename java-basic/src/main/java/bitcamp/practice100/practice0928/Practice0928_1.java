package bitcamp.practice100.practice0928;

public class Practice0928_1 {

    public static void m1(int value) {
        System.out.println(value);
      }

    public static void main(String[] args) {
        System.out.println(10 + 3);
        System.out.println(10 - 3);
        System.out.println(10 * 3);
        System.out.println(10 / 3);
        System.out.println(10 % 3);

        int a = 5, b = 2;
        float f = a / b;

        System.out.println(f);

        float f2 = (float) a / (float) b;

        System.out.println(f2);

        float f3 = (float) a / b;
        System.out.println(f3);

        float f4 = a / (float) b;
        System.out.println(f4);

        // int i = '가';
        // for(int j = 0 ; j < 10; j++){
        //     System.out.printf("%c의 유니코드 값 :",i+j);
        //     System.out.printf("%d\n",i+j);

        //1) 전위(pre-fix) 연산자
        int i = 10;
        ++i; // i = i + 1 명령과 같다.
        System.out.println(i);

        --i; // i = i - 1 명령과 같다.
        System.out.println(i);

        //2) 후위(post-fix) 연산자
        i = 10;
        i++; // i = i + 1 명령과 같다.
        System.out.println(i);

        i--; // i = i - 1 명령과 같다.
        System.out.println(i);


        int x = 0;
        int k = 10;

        x = ++k;
        System.out.printf("i = %d, x = %d\n", k, x);

        k = 10;

        x = k++;

        System.out.printf("i = %d, x = %d\n", k, x);

        int r = 3;
        m1(++r);
        /* 실행 순서
         * => i = i + 1
         * => m1(4) <-- i 변수의 값을 그 자리에 놓는다.
         * => m1(4) <-- 함수를 호출한다.
         */
        
        r = 3;
        m1(r++);

        System.out.println(5 == 3);
        System.out.println(5 != 3);
        System.out.println(5 < 3);
        System.out.println(5 <= 3);
        System.out.println(5 > 3);
        System.out.println(5 >= 3);




        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println(!true);
        System.out.println(!false);


    }

}
