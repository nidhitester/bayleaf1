import java.io.BufferedReader;
import java.io.InputStreamReader;

//count total number of 'a' in string

public class Que8 {
    public static void main (String[]args) throws Exception{


        //setup input mechanism by setting input reader
        BufferedReader r=new BufferedReader( new InputStreamReader(System.in));

//ask user to enter string
        System.out.println("enter the string: ");

        //string store in r,readerline and storing data in string data

        String data= r.readLine();

        System.out.println("enter the character :");
        //use system.in.read to read character
        //store in char variable
        char ch=(char)System.in.read();


//now we have to compare each position inside the string to find where character is appearing
        int n=0;

        for(int i=0;i<data.length();i++){
            char c=data.charAt(i);
            if(c==ch)
            {
                n++;//no of times character was found

            }


        }
        System.out.println(n);

    }


}
