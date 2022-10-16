import java.util.ArrayList;
import java.util.Scanner;
//CodeForce1767A

public class lucky {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        char [] listOfNum;
        String ans = "";
        for (int i = 0; i < testCase; i++){
            String temp = scan.next();



            if ((Integer.parseInt(temp.substring(0,1))+ Integer.parseInt(temp.substring(1,2))+
                    Integer.parseInt(temp.substring(2,3))) == (Integer.parseInt(temp.substring(3,4)) +
                    Integer.parseInt(temp.substring(4,5)) + Integer.parseInt(temp.substring(5)))){
                ans += "\n"+ "Yes";
            } else {
                ans += "\n"+ "No";
            }

        }
        System.out.println(ans.substring(1));
    }
}
