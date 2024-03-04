public class baiabcde {
    public static void main(String[] args) {
        int x = 1, y = 2;
        boolean a = y > x;
        int z = 3, k = 10, l = 5;
        boolean b = (z <= y && k > l);
        int m = 7, n = 8, j = 1000;
        boolean c = (m < n || j < x);
        int h = 6;
        boolean d = (h < m && k > l || false  );
        int f = 9, s = -5, p = 11;
        boolean e = (!(k<=f) || !(true && (k > z))) && ( l <= s && (!(k > p) || true));
        System.out.println(a);
        System.out.println(b); 
        System.out.println(c);
        System.out.println(d); 
        System.out.println(e);  
    }
}