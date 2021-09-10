import java.util.Scanner; 

 class r2 {
     public static void main ( String[] args) {
    
     Scanner Scn = new Scanner(System.in);

      int s = Scn.nextInt(), a = Scn.nextInt();

      Scn.close();

      int b = (a * 2) - s;
     System.out.println(b);
     }
   
}
