package bitcamp.practice100.practice1031;

public class Array {
	Object[] arr = new Object[10000];
	int cursor = 0;

	public void add(Object obj) {
		if (cursor == arr.length)
			return;
		arr[cursor] = obj;
	}

	public Object get(int index) {
		if (index < 0 || index >= cursor)
			return null;
		return arr[index];
	}

	public int size() {
		return cursor;
	}

	public Object remove(int index) {
		if (index < 0 || index >= cursor)
			return null;
		Object removeData = arr[index];
		for (int i = index; i <= cursor - 1; i++) {
			arr[i] = arr[i + 1];
		}
		cursor--;
		return removeData;
	}

	public void insert(int index, Object obj) {
		if (index < 0 || index >= cursor)
			return;
			for(int i = cursor-1 ; i > index ; i--) {
			arr[i+1] =arr[i];
		}
			arr[index] = obj;
			cursor++;
		
	}
}
