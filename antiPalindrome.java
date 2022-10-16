import java.util.Scanner;
//CodeForce981A

public class antiPalindrome {
    static String word;

    public static boolean checkAntiPalindrome (char[] str){
        boolean flag = true;
        int i = 0;
        for (int j = str.length - 1; i <= j; j--) {
            if (str[i] != str[j]) {
                flag = false;
            }
            i++;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        word = scan.nextLine();
        boolean flag1 = true;
        char[] str = word.toCharArray();
        if (checkAntiPalindrome(str)){
            for(int k = 0; k+1 < str.length; k++){
                if (str[k] != str[k+1]){
                     flag1 = false;
                }
            } if (flag1){
                System.out.println("0");
            }else {
                int n = str.length-1;
                System.out.println(n);
            }
        }else{
            System.out.println(str.length);
        }

    }
}
