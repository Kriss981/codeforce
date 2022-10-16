import java.util.Scanner;
//CodeForce750A

public class newYearAndHurry {

    public static void main(String[] args) {
        int timeToParty;
        int numOfTest;
        int solveTests = 0;
        int prevTime = 0;
        Scanner scan = new Scanner(System.in);
        numOfTest = scan.nextInt();
        timeToParty = scan.nextInt();
        for (int i = 1; i <= numOfTest; i++){
            if(prevTime + 5 * i + timeToParty <= 240){
                solveTests++;
                prevTime += 5 * i;
            }
        }
        System.out.println(solveTests);
    }
}
