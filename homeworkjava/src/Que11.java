import java.util.Scanner;

public class Que11 {
    public static void main(String[] args) {
        int i,n,even=0,odd=0;

        Scanner s=new Scanner(System.in);
        System.out.println("enter five digit number");
        for( i=1;i<=5;i++){
            n=s.nextInt();

            if(n%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("no of even numbers is" + even);
        System.out.println("no of odd numbers is" + odd);

    }

}
