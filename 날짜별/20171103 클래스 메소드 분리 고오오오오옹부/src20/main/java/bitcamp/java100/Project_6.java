
package bitcamp.java100;

public class Project_6 {
	
	
	static class Score{
		
	}

    public static void main(String[] args){
    	// 학생의 성적을 저장할 때 사용할 사용자 정의 데이터 타입을 만든다.
    	class Score{
    		String name;
    		int kor;
    		int mat;
    		int eng;
    		int sum;
    		float avr;
    		
    		void compute(){
    			sum = kor+mat+eng;
    			avr = sum/3.0f;
    		}
    		
    	}
    	
    	Score s1 = new Score();
    	Score s2 = new Score();
    	Score s3 = new Score();
    	s1.name ="홍길동";
    	s1.kor = 100;
    	s1.mat = 90;
    	s1.eng = 80;
    	s1.compute();
    	
    	s2.name ="임꺽정";
    	s2.kor = 80;
    	s2.mat = 80;
    	s2.eng = 80;
    	s2.compute();
    	
    	s3.name ="유관순";
    	s3.kor = 100;
    	s3.mat = 100;
    	s3.eng = 100;
    	s3.compute();
    	
    	 System.out.printf("%s,%d,%d,%d,%d,%f\n", 
                 s1.name, s1.kor, s1.eng, s1.mat, s1.sum, s1.avr);
    	 System.out.printf("%s,%d,%d,%d,%d,%f\n", 
                 s2.name, s2.kor, s2.eng, s2.mat, s2.sum, s2.avr);
         System.out.printf("%s,%d,%d,%d,%d,%f\n", 
                 s3.name, s3.kor, s3.eng, s3.mat, s3.sum, s3.avr);


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