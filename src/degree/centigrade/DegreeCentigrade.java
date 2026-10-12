package degree.centigrade;

import java.util.Scanner;

public class DegreeCentigrade {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the percentage");
        int DegreeCentigrade = in.nextInt();
        if (DegreeCentigrade <= 0) {
            System.out.println("متجمدة");
        } else if (DegreeCentigrade < 100 && DegreeCentigrade > 0) {
            System.out.println("سائلة");
        } else if (DegreeCentigrade >= 100) {
            System.out.println("غازية");
        } else {
            System.out.println("ERORR");
        }

    }

}
