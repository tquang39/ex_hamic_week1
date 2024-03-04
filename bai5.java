import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    char a = input.next().charAt(0);
    char b = input.next().charAt(0);

    int c = Math.abs(a - b);
    System.out.println(c);
    

    input.close();
    }
}
