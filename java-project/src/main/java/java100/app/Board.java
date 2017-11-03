package java100.app;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Board {
	
	protected int viewcnt;
	protected int num;
	protected String title;
    protected String content;
    protected String date;
    
    //new SimpleDateFormat("yyMMddhhmmss").format(new java.sql.Date(System.currentTimeMillis()));
    
    public Board() {}
    
    public Board(int num,String title, String content) {
    	this.num = num;
        this.title = title;
        this.content = content;
        
    }
    public void print() {
        System.out.printf("번호 : %d	", this.num);
        System.out.printf("제목 : %s	", this.title);
        System.out.printf("등록일 : %s	", this.date);
        System.out.printf("조회수 : %d	", this.viewcnt);
        System.out.println();
    }
    
    public void input() {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("번호? ");
        this.num = Integer.parseInt(keyScan.nextLine());
        
        System.out.print("제목? ");
        this.title = keyScan.nextLine();
        
        System.out.print("내용? ");
        this.content = keyScan.nextLine();
        
        this.date = new SimpleDateFormat("YYYY-MM-dd-hh-mm-ss").format(new java.sql.Date(System.currentTimeMillis()));
     
    }
    
    public void printDetail() {
        System.out.printf("제목: %s		", this.title);
        System.out.printf("내용: %s		", this.content);
        System.out.printf("등록일 : %s		", this.date);
        System.out.printf("조회수 : %d		",++this.viewcnt);
        System.out.println();
        
    }
    
    public void update() {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.printf("제목?(%s) ", this.title);
        String title = keyScan.nextLine();
        if (title.isEmpty()) {
            title = this.title;
        }
        
        System.out.printf("내용? ", this.content);
        String content = keyScan.nextLine();
        if (content.isEmpty()) {
            content = null;
        }
        
        if (Prompts.confirm2("변경하시겠습니까?(y/N) ")) {
            this.title = title;
            this.content = content;
            this.date = new SimpleDateFormat("YYYY-MM-dd-hh-mm-ss").format(new java.sql.Date(System.currentTimeMillis()));
            System.out.println("변경하였습니다.");
         
            
        } else {
            System.out.println("변경을 취소하였습니다.");
        }
    }    
}
