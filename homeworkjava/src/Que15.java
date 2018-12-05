import java.util.Scanner;

public class Que15 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int num=s.nextInt();
        int sum=0,r;
        int temp=num;

        while(num>0){
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;

        }
        if(temp==sum){
            System.out.println("it is a palindrome number");
        }
        else{
            System.out.println("it is not a palindrome number");
        }
    }
}
