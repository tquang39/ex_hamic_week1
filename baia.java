import java.util.Scanner;

public class baia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean result;
        if (n > 0 || n <0) {
            result = true;
        } else {
            result = false;
        }
        // In ra kết quả kiểm tra
        System.out.println(result);
        input.close();
    }
}
