import java.util.Scanner;

public class Que7 {
    public static void main(String[] args) {

        //create object of scanner class
        Scanner s=new Scanner(System.in);

        //input value from user
        System.out.println("enter number: ");

        int n=s.nextInt();
        //declare and initalize array....
        int[] a=new int[n];
        int i,j,temp=0;
        //now get all array elements from user
        System.out.println("enter"+n+"Array Elements: ");

        for(i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        //print all array element
        System.out.println("\nArray Element Are: ");

        for(i=0;i<n;i++){
            System.out.println(" "+a[i]);

        }
        //arrange array in assending order..
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }
        //print array in ascending order
        System.out.println("\nArrar Elements in ascending order : ");
        for(i=0;i<n;i++){
            System.out.println(" "+a[i]);

        }
    }
}
