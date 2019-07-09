
import java.util.HashSet;

public class Que4 {
    //find duplicate value
    public static void main(String[] args) {
        int[] a= {1, 5, 9, 7, 5, 3, 2, 9};
        /*int temp=-1;
        //create object of hashset class
        HashSet<Integer> hs=new HashSet<>();
        for (int i=a.length-1;i>=0;i--)
        {
            if(hs.contains(a[i]))
            {
                temp=i;
            }

            else{hs.add(a[i]);
        }
        if (temp!=-1){
            System.out.println("first duplicate element is "+a[temp]);
        }
        else{

            System.out.println("first duplicate element not found");*/

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println("duplicate number is :"+a[i]);
                }
            }
        }


    }}
