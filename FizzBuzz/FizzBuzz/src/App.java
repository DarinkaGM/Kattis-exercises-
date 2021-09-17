import java.util.Scanner;

public class App {

    public static void main(String[] args)  {

    Scanner Scan = new Scanner(System.in);

    int X = Scan.nextInt(), Y = Scan.nextInt(), N = Scan.nextInt();

        for (int i = 1; i <= N; i++){
            if ( i % X == 0 && i % Y == 0 ) {
                System.out.println("FizzBuzz");
            }
            else if (i % X == 0 ) { 
                System.out.println("Fizz");
            }
            else if (i % Y == 0 ) { 
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        };
      Scan.close();
    }

}
