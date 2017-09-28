package bitcamp.java100;

public class Project_04 {

    public static void main(String[] args) throws Exception {
        String[] name1 = { "홍길동","임꺽정","유관순"}; 
        int[] kor = { 100, 80, 100 };
        int[] mat = { 90, 80, 100 };
        int[] eng = { 80, 80, 100 };

        for (int i = 0; i < 6; i++) {
            int sum = kor[i] + mat[i] + eng[i];
            double avr = sum / 3.0f;
            System.out.printf("%-4s : %4d,%4d,%4d,%4d,%6.1f\n", name1[i], kor[i], mat[i], eng[i], sum, avr);
        }

    }
}

// String[][] Score =new String[][]{{"홍길동"," 100","  90","  80"," 270"," 90.00"},{"임꺽정","  80","  80","  80"," 240"," 80.00"},{"유관순"," 100"," 100"," 100"," 300"," 100.0"}};

// for (int i=0; i<3; i++){
//     for(int j=0; j<7 ; j++)
//     if(j==6){
//         System.out.println();
//     }else{
//         System.out.print(Score[i][j]);
//     }

// }