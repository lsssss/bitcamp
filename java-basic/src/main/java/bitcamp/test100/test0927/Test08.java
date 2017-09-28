package bitcamp.test100;

public class Test08{

  public static void main(String[] args){

    int[] arr1 = new int[3];
    arr1[0] = 10;
    arr1[1] = 20;
    arr1[2] = 30;

    System.out.printf("%d, %d, %d\n",arr1[0],arr1[1],arr1[2]);

    arr1 = new int[]{40,50,60,70,80};

    System.out.printf("%d, %d, %d, %d, %d\n",arr1[0],arr1[1],arr1[2],arr1[3],arr1[4]);
  }
}