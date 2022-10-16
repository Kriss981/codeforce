import java.util.ArrayList;
import java.util.Scanner;
//CodeForce1512A

public class spyDetected {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfCase;
        int numOfNum;
        int temp;
        int diff = 0;
        ArrayList<Integer> testCases = new ArrayList<>();
        numOfCase = scan.nextInt();
        for (int i = 0; i < numOfCase; i++){
            numOfNum = scan.nextInt();
            testCases.clear();
            for (int k = 0; k < numOfNum; k++) {
                temp = scan.nextInt();
                testCases.add(temp);
            }
            for (int j = 0; j+2 < testCases.size(); j++){
                if (!testCases.get(j).equals(testCases.get(j+1)) &&
                        !testCases.get(j).equals(testCases.get(j+2))){
                    diff = testCases.get(j);
                    System.out.println(j+1);
                    break;
                } else if (!testCases.get(j).equals(testCases.get(j+1)) &&
                        testCases.get(j).equals(testCases.get(j+2))){
                    diff = testCases.get(j+1);
                    System.out.println(j+2);
                    break;
                } else if (testCases.get(j).equals(testCases.get(j+1)) &&
                        !testCases.get(j).equals(testCases.get(j+2))){
                    diff = testCases.get(j+2);
                    System.out.println(j+3);
                    break;
                }
            }
        }
    }
}
