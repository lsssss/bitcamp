package bitcamp.practice100.practice1101;

public class Stack2<T> {

	private class Box{
		T value;
		Box next;
		
		public Box() {}
	
		public Box(T value) {
			this.value = value;
		}
	}
	
	Box top;
	
	int len;
	
	public void push(T value) {
		Box box = new Box(value);
		box.next = top;
		top= box;
		len++;
	}
	
	public int size() {
		return len;
	}
	
	public T pop() {
		if(len == 0)
			return null;
		Box box = top;
		top = top.next;
		len--;
		return box.value;
		
			
	}

}
