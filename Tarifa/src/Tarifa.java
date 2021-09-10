import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        int x = s.nextInt(), n = s.nextInt(), P = x * (n + 1);
        for (int i = 0; i < n; i++) {
            P -= s.nextInt();
        }
        System.out.println(P);
        s.close();
    }
}
