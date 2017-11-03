package bitcamp.java100;

public class Project_03 {
    
    public static void main(String[] args) {

        String[] names = {"국어","영어","수학","도덕","체육" ,"총점","평균"};

        int[][] score = new int[5][7];
        
        int tot=0,sum=0;
        double avr=0;
        avr = sum/3.0f;

        for (int i=0; i<7; i++){
        	System.out.printf(" %s ",names[i]);
            if(i==6){
                System.out.println();
            }
        }


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                int no = (int)(Math.random() * 100);
                    
                    
                    if(j==5){
                        System.out.printf("%4d",tot);
                    }else if(j==6){
                        avr = tot/5.0f;
                        System.out.printf("%f",avr);
                        System.out.println();
                    }else{
                        score[i][j]=no;
                        tot=tot+no;
                        System.out.printf("%4d",score[i][j]);
                    }

                    
                    
        }
        tot=0;   

    }
    }
}