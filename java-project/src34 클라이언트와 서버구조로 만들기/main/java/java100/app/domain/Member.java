package java100.app.domain;

import java100.app.control.CSVFormatException;

public class Member {
    protected int no;
    protected String name;
    protected String email;
    protected String password;
    protected Date createdDate;
    
    public Member() {}
    
    public Member(int no,String name, String email) {
    	
    	this.no =no;
        this.name = name;
        this.email = email;
        
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}









