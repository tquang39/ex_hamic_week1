import java.util.Scanner;

public class bai4 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String a = input.nextLine();
    String b = input.nextLine();
    
    String c = b.concat(" ");
    c = c.concat(a);
    System.out.println(c);
    
    input.close();
    }
}
