public class baif {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double d = Double.parseDouble(args[3]);
        double e = Double.parseDouble(args[4]);
        double f = Double.parseDouble(args[5]);
        // dung pp Crammer
        double determinant = a*e - b*d; // dinh thuc
        double detX = c*e - b*f;
        double detY = a*f - c*d;
        if (determinant == 0){
            if (detX == 0 && detY == 0) {
                System.out.println("VSN");
            }
            else {
                System.out.println("VN");
            }
        }
        else {
            double x = detX/determinant;
            double y = detY/determinant;
            System.out.println("Phuong trinh co nghiem la: \nx = " + x + " \ny = " + y);
        }
    }
}
