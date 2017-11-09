package bitcamp.test100.test1109;

public class Test3 {

	

	
	public static void main(String[] args) throws Exception {
		
		class Myclass implements AutoCloseable{
			@Override
			public void close() throws Exception {
				System.out.println("오토클로즈 실행");
				
			}
			
		}
		
		try(Myclass s = new Myclass();){
			
			try {
				int k = 20/2;
				System.out.println(k);
			}catch(ArithmeticException e) {
				System.out.println("하하에러다에러");
			}
			
		}
	}
}
