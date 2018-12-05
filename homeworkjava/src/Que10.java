import java.util.Scanner;

public class Que10 {
    public static void main(String[]args){
        int num=0;//to store value given by user
        int rem=0;
        int sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");

        num=s.nextInt();//this read the value given by user
        while(num>0){
            //to find out remainder
           rem= num%10;
           //add remainder into sum
            sum=sum+rem;
            //change value of number variable
            num=num/10;

        }
        System.out.println("sum of digits is" + sum);

    }

}
