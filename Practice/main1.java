import java.util.*;
public class main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Integer - ");
        int i = scan.nextInt();
        System.out.println("Enter a Double Value - ");
        double d = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter a String - ");
        String stg = scan.nextLine();
        System.out.println("String: " + stg);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
}

