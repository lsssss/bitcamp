package bitcamp.test100.test0928;

public class Test0928_2 {
    public static void main(String[] args) {

        int[] arr1 = { 100, 200, 300 };
        int[] arr2;

        arr2 = arr1;

        arr2[1] = 150;
        System.out.printf("%d,%d,%d\n",arr1[0],arr1[1],arr1[2]);  

    }
}