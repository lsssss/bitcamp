package bitcamp.java100;

public class Project_05 {
	public static void main(String[] args) {

		class Scores {
			
			String[] name = new String[3];
			int[] sub = new int[10];
			int sum;
			float aver;
			
			void subprint() {
				
			}
			
			void tot(synchronized){
				for(int i=0; i < sub.length ; i++) {
					sum+=sub[i];
					aver= sum/sub.length;
				}
				
			}
			
		}

	}
	
	
}
