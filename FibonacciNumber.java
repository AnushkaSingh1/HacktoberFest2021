import java.util.Scanner;

public class FibonacciNumber {

    public static void series(int count) {
        if (count <= 1) {
            return;
        }
        int n1 = 0, n2 = 1, n3,i;

        System.out.print(n1+" "+n2);

        for ( i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(" "+n3);

            n1=n2;
            n2=n3;
        }
    }
    public static void main(String[] args) {
        
        System.out.print("enter nth NO.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        series(n);
    }
}
