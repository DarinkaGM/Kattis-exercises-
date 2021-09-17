import java.util.Scanner;

public class Spavanac {
    public static void main(String[] args) throws Exception {
        Scanner Scan = new Scanner(System.in);
        int H = Scan.nextInt(), M = Scan.nextInt();


        // let Hour = (00 - 24);
        // let Minutes = (00 - 60);

    //     var WakeUp = H + (M - 45);
        M =  M-45;
        if (M < 0){
         H--;
         M = (M + 60);
            if ( H < 0) {
                H = 23;
            }
        };

        Scan.close();

        System.out.println( H + " " + M );

    }
}
