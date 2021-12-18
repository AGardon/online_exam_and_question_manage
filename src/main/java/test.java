import java.util.Arrays;

public class test {


    public static void main(String[] args) {

//        int[] arr = {1,3,5,12,32,41,12,23,9};
//        func1(arr);
//        System.out.println(Arrays.toString(arr));
    }

    public static void func1(int []arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] >= arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void func2 (){

    }
}


