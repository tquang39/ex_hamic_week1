
import java.util.Scanner;
import java.text.DecimalFormat;

public class bai1 {

    public static void main(String[] args) {
        DecimalFormat lamtron = new DecimalFormat("#.##");
        Scanner sc = new Scanner(System.in);
        double cd = sc.nextDouble();
        double cr = sc.nextDouble();

        double perimeter = (cd + cr) * 2;
        double acreage = cd*cr;
        System.out.println("Chu vi chu nhat: " + lamtron.format(perimeter));
        System.out.println("Dien tich chu nhat: " + lamtron.format(acreage));

        sc.close();
    }
}
