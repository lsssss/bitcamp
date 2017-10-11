package bitcamp.java100;

public class Test15_11_2 {

    public static void main(String[] args) {

// 임무 : 파일의 정보를 저장하라!
// 저장할 정보 -디렉토리여부, 소유주/그룹/기타 사용자의 사용권한(읽기,쓰기,실행 권한 정보)
// 1. 클래스 이용해서 만들기     	
    	
    		int[] a = {1,1,1,1,1,0,1,1,0,1};
    		// 1 4 7
    		// 2 5 8
    		// 3 6 9
    		
    		for(int i=0; i < a.length ; i++) {
    			if(a[i] == 1 && i == 0) 
    				System.out.print("d");
    			else if(a[i] == 0 && i == 0)
    				System.out.print("_");
    			else if(a[i] == 1 && (i+3) %3 ==1 )
    				System.out.print("r");
    			else if(a[i] == 0 && (i+3) %3 ==1 )
    				System.out.print("_");
    			else if(a[i] == 1 && (i+3) %3 ==2 )
    				System.out.print("w");
    			else if(a[i] == 0 && (i+3) %3 ==2 )
    				System.out.print("_");
    			else if(a[i] == 1 && i %3 == 0 )
    				System.out.print("x");
    			else if(a[i] == 0 && i %3 == 0 )
    				System.out.print("_");
    			else System.out.print("h");	
    		}
  	
    		
    		
    		 
    		
    }
}







