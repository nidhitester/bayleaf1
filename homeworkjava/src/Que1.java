import java.util.Arrays;
//sort numeric and string arrays
public class Que1 {
    public static void main(String[] args) {

        int[]arr={10,8,15,3,11};//numeric array

        String[]arr1={"raj","jhon","pam","sam"};//string array

        Arrays.sort(arr);//command to sort in order
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

    }
}
