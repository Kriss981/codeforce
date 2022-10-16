import java.util.Scanner;
//CodeForce509A

public class maximumInTable {

    public static int count(int x, int y){
        if (x ==1){
            return 1;
        }if (y == 1){
            return 1;
        }else {
            return count(x-1,y) + count(x, y-1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(count(num, num));
    }
}
