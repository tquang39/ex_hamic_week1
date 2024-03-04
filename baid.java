public class baid {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        if ( a == 0) {
            if (b != 0) {
                System.out.println("VN");
            }
            else {
                System.out.println("VSN");
            }
        }
        else {
            System.out.println("Phuong trinh co 1 nghiem la:" + (-b/a));
        }
    }
}
