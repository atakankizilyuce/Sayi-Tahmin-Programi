import java.util.Scanner;
import java.util.Random;
public class SayiTahminProgrami {
 
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rastgele = new Random();
        int rastgele_sayi = 1 + rastgele.nextInt(100);
        System.out.println("Rastgele sayi 1 ile 100 arasındadır.");
        int sayi,sayac = 0;
        do {
            System.out.print("Bir sayi giriniz: ");
            sayi = scan.nextInt();
            if(sayi > rastgele_sayi) {
                System.out.println("Sayiyi küçültün.");
            }
            else if(sayi < rastgele_sayi) {
                System.out.println("Sayiyi büyütün.");
            }
            sayac++;
        }
        while(sayi != rastgele_sayi);
        
        System.out.println("Tebrikler!! " + sayac + ". denemede sayıyı buldunuz.");
        scan.close();
}
}

