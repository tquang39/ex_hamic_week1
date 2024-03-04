import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int l = input.nextInt();
        int r = input.nextInt();
        int t = input.nextInt();
        int sum = 0;
        for (int i = l; i <= r; ++i) {
            if (i % t == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
        input.close();
    }
}
