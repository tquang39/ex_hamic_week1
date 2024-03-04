import java.util.Scanner;
import java.text.DecimalFormat;

public class bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat rouding = new DecimalFormat("#.##");

        double[] pA = new double[3];
        double[] pB = new double[3];

        System.out.println("Nhap cac diem cua A:");
        for ( int i = 0; i < 3; ++i) {
            pA[i] = input.nextDouble();
        }

        System.out.println("Nhap cac diem cua B:");
        for ( int j = 0; j < 3; ++j) {
            pB[j] = input.nextDouble();
        }

        double distance = Math.sqrt( Math.pow(pA[0] - pB[0],2) 
                                    + Math.pow(pA[1]- pB[1],2) 
                                    + Math.pow(pA[2] - pB[2],2));
        System.out.println(rouding.format(distance));

        input.close();
    }
}
