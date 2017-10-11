package bitcamp.java100;

public class Test15_11_1 {

    public static void main(String[] args) {

// 임무 : 파일의 정보를 저장하라!
// 저장할 정보 -디렉토리여부, 소유주/그룹/기타 사용자의 사용권한(읽기,쓰기,실행 권한 정보)
// 1. 클래스 이용해서 만들기     	
    	
    	class Privilege{
    		boolean isDir;
    		boolean ownerRead;
    		boolean ownerWrite;
    		boolean ownerExe;
    		boolean groupRead;
    		boolean groupWrite;
    		boolean groupExe;
    		boolean otherRead;
    		boolean otherWrite;
    		boolean otherExe;
    	}
    	
    	Privilege p1 = new Privilege();
    	
    	p1.isDir = false;
    	p1.ownerRead = true;
    	p1.ownerWrite = true;
    	p1.ownerExe = true;
    	p1.groupRead = true;
    	p1.groupWrite = false;
    	p1.groupExe = true;
    	p1.otherRead = true;
    	p1.otherWrite = false;
    	p1.otherExe = true;
    	
    	
    	System.out.print(p1.isDir ? "d " : "_ ");
       	System.out.print(p1.ownerRead ? "r " : "_ ");
       	System.out.print(p1.ownerWrite ? "w " : "_ ");
       	System.out.print(p1.ownerExe ? "x " : "_ ");
       	System.out.print(p1.groupRead ? "r " : "_ ");
       	System.out.print(p1.groupWrite ? "w " : "_ ");
       	System.out.print(p1.groupExe ? "x " : "_ ");
       	System.out.print(p1.otherRead ? "r " : "_ ");
       	System.out.print(p1.otherWrite ? "w " : "_ ");
       	System.out.print(p1.otherExe ? "x " : "_ ");
       	
       	
//    	if(p1.isDir) {
//    		System.out.println("d");
//    	}else {
//    		System.out.println("_");
//    	}
    	
    }
}







