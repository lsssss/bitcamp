package bitcamp.test100.test1109;

import java.util.Scanner;

public class Test6 {

    public static void main(String[] args) {
       
        	String k = "k";
        
        try( Scanner keyScan = new Scanner(System.in);) {
        	
        	System.out.print("입력> ");
            String str = keyScan.next().toLowerCase();
            
            switch(str){
            	case "a" :	throw new Exception("exception에러가 나타났다.......");
            	
            }
            
            	System.out.println(str);
         
            
        } catch(Exception e) {
        	System.out.println(e);
        	System.out.println("catch블록실행");
        	
        }

    }
	
}
