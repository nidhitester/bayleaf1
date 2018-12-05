public class Que3 {
    //specific position
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        //which position we need to insert
        int position = 3;
        //element is we need to insert 100 on 3 position
        int element = 100;
        //we traverse array from back
        for (int i = arr.length - 1; i > position - 1; i--){
            arr[i]=arr[i-1];

        }

arr[position-1]=element;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}