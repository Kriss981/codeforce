import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//CodeForce499B
public class lecture {
    public static void main(String[] args) {
        String original = null, second = null;
        int numOfWords, numOfLine;
        Scanner scan = new Scanner(System.in);
        numOfWords = scan.nextInt();
        numOfLine = scan.nextInt();
        Map<String,String> wordSets = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numOfLine; i++) {
                original = scan.next();
                second = scan.next();
                wordSets.put(original, (original.length() <= second.length())? original:second);
        }

        for (int k = 0; k < numOfWords; k++){
            String temp;
            temp = wordSets.get(scan.next());
            result.append(temp + " ");
        }
        System.out.println(result.toString().trim());
    }
}
