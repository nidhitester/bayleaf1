import java.util.Scanner;
//reverse string
public class Que18 {
    public static void main(String[] args) {

        String name;
        //scanner to let user put string
        Scanner s=new Scanner(System.in);
        System.out.println("entre a string");
        //make object
        name=s.nextLine();
        System.out.println(new StringBuilder(name).reverse().toString());
    }
}
