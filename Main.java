import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double fiyat, kdvOrani = 0.18, kdvTutari, kdvLiTutar;

        Scanner inp = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz: ");
        fiyat = inp.nextDouble();

        kdvTutari = fiyat * kdvOrani;
        kdvLiTutar = fiyat + kdvTutari;
        
        System.out.println("KDV'siz Fiyat" + fiyat);
        System.out.println("KDV Oranı: " + kdvOrani);
        System.out.println("KDV Tutarı: " + kdvTutari);
        System.out.println("KDV'li Fiyat: " + kdvLiTutar);
    }
}
