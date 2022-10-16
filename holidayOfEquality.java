import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//CodeForce758A

public class holidayOfEquality {
    public static void main(String[] args) {
        int numOfCitizens;
        int numOfHolidays = 0;
        int max;
        int temp, sum = 0;
        Scanner scan = new Scanner(System.in);
        numOfCitizens = scan.nextInt();
        List<Integer> holidays = new ArrayList<>();
        for (int i = 0; i < numOfCitizens; i++){
            numOfHolidays = scan.nextInt();
            holidays.add(numOfHolidays);
        }
        max = Collections.max(holidays);

        for (int k = 0; k < numOfCitizens; k++){
            temp = max - holidays.get(k);
            sum += temp;
        }
        System.out.println(sum);
    }
}
