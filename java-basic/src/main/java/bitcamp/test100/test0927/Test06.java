package bitcamp.test100;

public class Test06{
    public static void main(String[] args){
        //1 배열 레퍼런스 변수 선언 하기
        byte[] arr1;

        arr1=null;

        arr1 = new byte[3];

        arr1[0] =10;
        arr1[1] =20;
        arr1[2] =30;

        System.out.printf("%d, %d, %d\n",arr1[0],arr1[1],arr1[2]);
        arr1[3] =40;
    }

}