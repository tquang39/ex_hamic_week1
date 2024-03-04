// Dùng lớp DecimalFormat để làm tròn số thập phân 
import java.text.DecimalFormat;

public class Bai1_1 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.###");
        double resultA = Math.pow(Math.sin(Math.PI / 16),2) + Math.pow(Math.cos(Math.PI / 16),2);
        double resultB = Math.sin(Math.PI / 3) - Math.cos(Math.PI / 4);
        double resultC = Math.pow(2,3) + (17/18);
        double resultD = Math.exp(((Math.pow(3,2) / Math.pow(5,3))) + Math.sin(Math.pow(Math.PI,2)));
        double resultE = Math.sqrt((Math.log(Math.pow(6,2))) + Math.tan(Math.PI));

        System.out.println("Result of A = " + df.format(resultA));
        System.out.println("Result of B = " + df.format(resultB));
        System.out.println("Result of C = " + df.format(resultC));
        System.out.println("Result of D = " + df.format(resultD));
        System.out.println("Result of E = " + df.format(resultE));
    } 
}