import java.util.ArrayList;
import java.util.Scanner;
//CodeForce432A

public class choosingTeam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfPeople = scan.nextInt();
        int numOfParticipate = scan.nextInt();
        ArrayList<Integer> numOfTimes = new ArrayList<>();
        for (int i = 0; i < numOfPeople; i++){
            int num = scan.nextInt();
            if (num <= 5 - numOfParticipate) {
                numOfTimes.add(num);
            }
        }
        System.out.println(numOfTimes.size()/3);
    }
}
