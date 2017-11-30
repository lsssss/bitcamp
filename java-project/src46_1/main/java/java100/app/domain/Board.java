package java100.app.domain;

import java.sql.Date;

public class Board {
    protected int no;
    protected String title;
    protected String content;
    protected String regDate;
    protected int viewCount;
    
    public Board() {}
    
    public Board(int no, String title, String regdate, int viewcnt) {

    	this.no = no;
    	this.title = title;
    	this.regDate = regdate;
    	this.viewCount = viewcnt;
    }

	@Override
    public String toString() {
        return "Board [no=" + no + ", title=" + title + ", content=" + content + ", regDate=" + regDate + ", viewCount="
                + viewCount + "]";
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }
    
}










