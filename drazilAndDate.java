import java.util.Scanner;
//CodeForce515A

public class drazilAndDate {


    public static void main(String[] args) {
        int x, y, z = 0;

        Scanner scan = new Scanner(System.in);
        boolean flag ;
        x = scan.nextInt();
        x = Math.abs(x);
        y = scan.nextInt();
        y = Math.abs(y);
        z = scan.nextInt();
        if (x == 0 && y == 0) {
            if (z%2 != 0) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        } else {
//            if (((x == 1 && y!= 1 || y == 1 && x!=1) && z % 2 == 1)) {
//                System.out.println("Yes");
//            }
            if (((z - (x + y)) % 2 == 0) && (z >= (x+y) )){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
