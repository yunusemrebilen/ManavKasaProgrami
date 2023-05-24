import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int armutf =1;
        int elmaf=2;
        int cilekf = 3;
        int muzf =4;

        System.out.print("Kaç kilo armut aldınız :");
         double armut= scan.nextDouble();
        System.out.print("Kaç kilo elma aldınız :");
        double elma =scan.nextDouble();
        System.out.print("Kaç kilo çilek aldınız :");
        double cilek =scan.nextDouble();
        System.out.print("Kaç kilo muz aldınız :");
        double muz = scan.nextDouble();

        double toplamFiyat = (armut*armutf) + (elma*elmaf) + (cilek*cilekf) + (muz*muzf);
        System.out.println(toplamFiyat);
    }
}
