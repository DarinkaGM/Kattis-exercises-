import java.util.Scanner;

public class TakeTwoStones {
    public static void main(String[] args) throws Exception {
        Scanner Scn = new Scanner(System.in);

        int i = Scn.nextInt();
        if (i % 2 == 0) {
            System.out.println("b");
        }
        else {
            System.out.println("a");
        }
        Scn.close();
    }
}
