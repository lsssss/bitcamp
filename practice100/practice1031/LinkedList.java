package bitcamp.practice100.practice1031;

public class LinkedList {

	Box head;
	Box tail;

	int len;

	public void add(Object value) {

		Box box = new Box();
		box.value = value;

		if (tail == null) {
			head = box;
			tail = box;
		} else {
			tail.next = box;
			tail = box;
		}

		len++;
	}

	public int size() {
		return len;
	}

	public Object get(int index) {
		if (index < 0 || index > len)
			return null;
		Box getBox = head;
		for (int i = 1; i < index; i++) {
			getBox = getBox.next;
		}
		return getBox.value;
	}

	public void insert(int index, Object value) {
		if (index < 0 || index >= len)
			return;

		Box box = new Box();
		box.value = value;
		len++;
		
		if(index == 0) {
			box.next = head;
			head = box;
		}
		
		Box pre = head;
		for(int i = 1 ; i < index ; i ++) {
			pre = pre.next;
		}
		box.next = pre.next;
		pre.next = box;
	}
	
	public Object remove(int index) {
		if (index < 0 || index >= len)
			return null;
		len--;
		System.out.println(len);
		Box removedBox;
		
		if(index == 0) {
			removedBox = head;
			head = head.next;
			return removedBox.value;
		}
		
		Box pre = head;
		for(int i = 1; i < index ; i++) {
			pre = pre.next;
		}
		removedBox = pre.next;
		pre.next = pre.next.next;
		
		if(index == len -1) {
			tail = pre;
		}
		return removedBox.value;
		
		}
}
