import java.util.Scanner;
//CodeForce1335A
public class candiesAndTwoSisters {

    public static void main(String[] args) {
        int numOfCount = 0,x;
        Scanner scan = new Scanner(System.in);
        numOfCount = scan.nextInt();
        for (int i =  0; i< numOfCount;i++){
            x = scan.nextInt();
            if (x >=3) {
//                if (x%2 != 0) {
//                    System.out.println(x/2);
//                    }else{
//                    System.out.println(x/2-1);
//                }
                System.out.println(x/2+x%2-1);
            } else {
                System.out.println("0");
            }
        }
        scan.close();
    }
}
