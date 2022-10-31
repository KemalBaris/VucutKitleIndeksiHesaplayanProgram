import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double boy,kilo;


        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu (metre cinsinden) Giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz : ");
        kilo = input.nextDouble();
        //Kilo (kg) / Boy(m) * Boy(m)
        double total = kilo / (boy*boy);

        System.out.println("Vücut Kitle İndeksiniz : " + total);



    }
}