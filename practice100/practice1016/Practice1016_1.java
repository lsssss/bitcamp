

package bitcamp.practice100.practice1016;

import java.util.Scanner;

public class Practice1016_1 {
	

	public static void main(String[] args){
		
		Score[] cat = {new Score(), new Score(), new Score(), new Score(), new Score()};
		Scanner csc = new Scanner(System.in);
		
		Score.catinit(cat[0],csc);
		Score.catinit(cat[1],csc);
		Score.catinit(cat[2],csc);
		Score.catinit(cat[3],csc);
		Score.catinit(cat[4],csc);
		csc.close();
		
		
		for(Score css : cat ) {
			Score.catprint(css);
		}
		
		
	}
	

}
