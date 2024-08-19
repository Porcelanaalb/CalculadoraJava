import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1 = 0, n2 = 0, res = 0;
                int bah = 0;
        System.out.println("digite um numeral");
        n1 = scan.nextInt();
        System.out.println("digite outro numeral");
        n2 = scan.nextInt();
        System.out.println("1=+, 2=-, 3=*, 4=/, 5=%");
        bah = scan.nextInt();
         if (bah==1){
             res=n1+n2;
        } else if (bah==2) {
             res=n1-n2;
         } else if (bah==3) {
             res=n1*n2;
         } else if (bah==4) {
             res = n1 / n2;
         } else
             res = n1 % n2;

         /* System.out.println(bah);
        switch (bah) {
            case 1:
                res = n1 + n2;
                break;
            case 2:
                res = n1 - n2;
                break;
            case 3:
                res = n1 * n2;
                break;
            case 4:
                res = n1 / n2;
                break;
        }*/


        System.out.print(res);
    }
}