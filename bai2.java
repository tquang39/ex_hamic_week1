import java.util.Scanner;
import java.text.DecimalFormat;

public class bai2 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat rounding = new DecimalFormat("#.##");

        double corner = input.nextDouble();
        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();

        double S = (edge1 * edge2 * Math.sin((corner * Math.PI)/180))/2;
        System.out.println(rounding.format(S));
        input.close();
    }
}
