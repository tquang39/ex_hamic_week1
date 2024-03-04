public class baig {
    public static void main(String[] args) {
        int scp = Integer.parseInt(args[0]);
        boolean result;
        if (scp > 0) {
            int sqrt = (int)Math.sqrt(scp);
            if (sqrt == scp || Math.pow(sqrt, 2) == scp) {
                result = true;
            }
            else {
                result = false;
            }
        }
        else {
            result = false;
        }
        System.out.println(result);
    }
}
