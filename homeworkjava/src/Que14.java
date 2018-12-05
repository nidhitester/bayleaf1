import java.util.Scanner;

public class Que14 {
    public static void main(String[] args) {
        int num=0,temp=0,rem=0,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        if(s.hasNext()){
            num=s.nextInt();//if there is another number
        }
        else{
            num=0;
        }
        temp=num;
        while(num!=0){
            rem=num%10;
            sum=sum+(rem*rem*rem);
            num=num/10;
        }
        if(temp==sum){
            System.out.println(num+" is an armstrong number");
        }
        else{
            System.out.println(num +"is not an armstrong number");}
    }
}
