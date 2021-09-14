import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) throws Exception {
        Scanner Scn = new Scanner(System.in);
        int ArticlesPublished = Scn.nextInt(), imp = Scn.nextInt();
        int CitationsRecieved = ((ArticlesPublished * (imp-1))+1);

        Scn.close();
        System.out.println(CitationsRecieved);
    }
}
/* imp = Math.ceil(CitationsRecieved/ArticlesPublished)
therefore: imp-1 < (CitationsRecieved/ArticlesPublished) <= imp
(imp-1)*ArticlesPublished < CitationsRecieved <= imp*ArticlesPublished
*/