import java.util.HashMap;
import java.util.Scanner;
//CodeForce731A

public class nightAtTheMuseum {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('A', 1);
        map.put('B', 2);
        map.put('C', 3);
        map.put('D', 4);
        map.put('E', 5);
        map.put('F', 6);
        map.put('G', 7);
        map.put('H', 8);
        map.put('I', 9);
        map.put('J', 10);
        map.put('K', 11);
        map.put('L', 12);
        map.put('M', 13);
        map.put('N', 14);
        map.put('O', 15);
        map.put('P', 16);
        map.put('Q', 17);
        map.put('R', 18);
        map.put('S', 19);
        map.put('T', 20);
        map.put('U', 21);
        map.put('V', 22);
        map.put('W', 23);
        map.put('X', 24);
        map.put('Y', 25);
        map.put('Z', 26);

        Scanner scan = new Scanner(System.in);
        char [] words = scan.next().toUpperCase().toCharArray();
        int temp = 0;
        int count = 0;
        int prev = 0;
        for (int i = 0; i < words.length; i++){
            if (i == 0) {
                if (26 - map.get(words[i]) + 1 < map.get(words[i]) - 1) {
                    temp = 26 - map.get(words[i]) + 1;
                    count += temp;
                } else {
                    temp = map.get(words[i]) - 1;
                    count += temp;
                }
            } else {
                int one = Math.abs(prev - map.get(words[i]));
                int two = 26 - prev + map.get(words[i]);
                int three = 26 - map.get(words[i]) + prev;
                if (one <= two && one <= three){
                    count += one;
                }else if (two < one && two < three){
                    count += two;
                } else {
                    count += three;
                }
            }
            prev = map.get(words[i]);
        }
        System.out.println(count);
    }
}
