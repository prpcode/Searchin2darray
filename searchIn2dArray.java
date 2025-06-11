import java.util.Scanner;
import java.util.Arrays;
public class searchIn2dArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the row size");
        int row = in.nextInt();
        System.out.println("enter the col size");
        int col = in.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("enter the object of an array");
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {

                arr[r][c] = in.nextInt();
            }
        }
        for (int r = 0; r < arr.length; r++) {

            System.out.println(Arrays.toString(arr[r]));

        }

        System.out.println("enter the target");
        int target = in.nextInt();

        int[] ans = searchIn2dArray(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchIn2dArray(int[][] arr , int target){
        for (int i = 0; i < arr.length; i++) {
            for(int c=0;c<arr[i].length;c++){
                if(arr[i][c]==target){
                    return new int[]{i,c};
                }

            }

        }
        return new int[]{-1,-1};

    }

}

