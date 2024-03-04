
public class baib {
    public static void main(String[] args) {
        
        int year = Integer.parseInt(args[0]);
        boolean result;
        if (year > 0) {
            if (year % 4 ==0 && year % 100 !=0) {
                result = true;
            }
    
            else if (year % 100 == 0 && year % 400 == 0) {
                result =true;
            }
    
            else {
                result = false;
            }
            System.out.println(result);
        }
        else {
            System.out.println("Vui long nhap so lon hon 0");
        }
    }
    
}
