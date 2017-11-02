package bitcamp.practice100.practice1101;

public class Test2 {
	public static void main(String[] args) {
		
	Stack2<Contact> contacts = new Stack2<>();
	contacts.push(new Contact("ddd","ddd","ddd"));
	
	Contact s = contacts.pop();
		
	System.out.printf("%s, %s ,%s",s.name , s.email, s.tel);
	}
}
