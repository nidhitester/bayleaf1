import java.util.Scanner;

public class que12 {
    public static void main(String[] args) {
        //user input number stored in num
        int num,rem,rev=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        num=s.nextInt();

        //while loop execute untill number value is not =0
        while(num!=0){
            //
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;

        }
        System.out.println(rev);
    }
}
