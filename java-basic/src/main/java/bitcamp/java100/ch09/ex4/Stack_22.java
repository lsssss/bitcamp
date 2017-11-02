// 역할: Stack 방식으로 데이터 목록 관리
//   
package bitcamp.java100.ch09.ex4;


public class Stack_22 {
    
    // non-static nested class => inner class
    private class Box {
        Object value;
        Box next;
    }
    
    // 시작 상자와 끝 상자의 주소
    Box top;
    Box bottom;
    
    // 전체 상자 개수
    int len;
    
    public Stack_22() {
    	top = new Box();
    	bottom = top;
    }
    
    public void push(Object value) {
        // 값을 보관할 상자를 준비한다.
        
    	top.value = value;
    	Box box = new Box();
    	box.next = top;
    	top = box;

    	
    	len++;
    }
    
    public int size() {
        return len;
    }
    
    public Object pop() {
    	if(len == 0)
    		return null;
    	
    	Box box = top;
    	
    	top = top.next;
    	
    	len--;
        return box.next.value;
    }
    
}










