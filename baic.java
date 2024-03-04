public class baic {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if ( age < 0) {
            System.out.println("Vui long nhap lai");
        }
        else {
            if (age > 18) {
                System.out.println("Passed");
            }
            else {
                System.out.println("Failed");
            }
        }
    }
}
