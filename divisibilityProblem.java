import java.util.Scanner;
//CodeForce1328A
public class divisibilityProblem {

    public static void main(String[] args) {
        int numOfCount = 0, x, y ;
        Scanner scan = new Scanner(System.in);
        numOfCount = scan.nextInt();
        for (int i =  0; i< numOfCount;i++){
            x = scan.nextInt();
            y = scan.nextInt();
            System.out.println((y - x%y)%y);
        }
    }
}
