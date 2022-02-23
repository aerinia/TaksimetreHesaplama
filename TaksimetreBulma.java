import java.util.Scanner;
public class TaksimetreBulma {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("KM'yi giriniz:");
        double km = scan.nextDouble();
        double ucret= km<4.5 ?20:km*2.2+10;
        System.out.println(ucret+" "+"TL ödemelisiniz");
    }
}
