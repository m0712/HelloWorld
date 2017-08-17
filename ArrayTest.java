package day05;

/**
 * Created by admin on 2017/8/15.
 */
public class ArrayTest {

    public static void main(String[] args) {
        int[] arr = {12,9,13,7,5};
        ArrayTest.sort(arr);
    }

    public static  void sort(int[] arr){
        for(int i = 0 ;i<arr.length - 1;i++){
            for(int y =0 ;y<arr.length -1-i;y++){
                if(arr[y]>arr[y+1]){
                    int tmp = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = tmp;
                }
            }
        }
        for (int num:arr) {
            System.out.println(num);
        }
    }




}
