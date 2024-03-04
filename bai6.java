import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    int sum = 0;
    for (int i = a; i <= b; ++i) {
        sum += i;
    }

    System.out.println(sum);
    
    input.close();
    }
}
