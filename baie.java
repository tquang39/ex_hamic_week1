

public class baie {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        
        double delta = Math.pow(b,2) - 4 * a * c;
        if ( a != 0 ) {
            if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println(x1);
            System.out.println(x2);
            }

            else if ( delta == 0) {
            double x = -b/(a*2);
            System.out.println(x);
            }

            else {
            System.out.println("Phuong trinh vo nghiem.");
            }
        }

        else {
			if ( b != 0) {
            System.out.println("phuong trinh bac 2 tro thanh phuong trinh bac 1 co nghiem la: " + (-c/b) );
			}
			
			else {
				if (c != 0) {
				System.out.println("Phuong trinh vo nghiem.");
				}
				else {
					System.out.println("Phuong trinh vo so nghiem.");
				}
			}
		}
    }
}
