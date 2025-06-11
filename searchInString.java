import java.util.Arrays;
import java.util.Scanner;

public class searchInString {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = in.nextLine();
        System.out.println("Enter the char to find in string");
        char ch = in.next().charAt(0);
        boolean bool = stringsearch(str, ch);
        System.out.println(bool);
        boolean b = stringsearch2(str, ch);
        System.out.println(b);
        System.out.println(str.toCharArray());
        System.out.println(Arrays.toString(str.toCharArray()));
    }


    static boolean stringsearch2(String str, char f) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == f) {
                return true;
            }
        }
        return false;
    }
        static boolean stringsearch(String str,char f){
            if (str.length() == 0) {
                return false;
            }

            for (int i = 0; i < str.length(); i++) {

                if (f == str.charAt(i)) {
                    return true;
                }


            }
            return false;
        }
    }

