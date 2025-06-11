import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of any array");
        int size = in.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the object of an array");

        for (int i = 0; i <size ; i++) {

            arr[i]=in.nextInt();

        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter the element to search");
        int target= in.nextInt();

        int ans =  Linearsearch(arr,target);
        System.out.println(ans+" ");

    }
    static int Linearsearch(int[] arr ,int target){
        if(arr.length==0)
            return -1;
        for (int i = 0; i <arr.length ; i++) {

            int element = arr[i];
            if(target==element)
                return i;
            }

         return -1;
        }



}