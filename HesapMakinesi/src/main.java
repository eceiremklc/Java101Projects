import java.util.Scanner;
public class main {
    public static void main(String [] args){
        Scanner gir=new Scanner(System.in);

        int ilkSayi, ikinciSayi;
        int secim;
        int sonuc;

        System.out.println("İlk sayıyı girin: ");
        ilkSayi=gir.nextInt();

        System.out.println("İkinci sayıyı girin: ");
        ikinciSayi=gir.nextInt();

        System.out.println("---------MENÜ----------");
        System.out.println("1.Toplama \n2.Çıkarma \n3.Çarpma \n4.Bölme");
        System.out.println("Seçiminiz: ");
        secim=gir.nextInt();

        switch (secim){
            case 1:
                sonuc=ilkSayi+ikinciSayi;
                System.out.println("Sonuç: "+sonuc);
                break;
            case 2:
                sonuc=ilkSayi-ikinciSayi;
                System.out.println("Sonuç: "+sonuc);
                break;
            case 3:
                sonuc=ilkSayi*ikinciSayi;
                System.out.println("Sonuç: "+sonuc);
                break;
            case 4:
                if(ikinciSayi!=0){
                    sonuc=ilkSayi/ikinciSayi;
                    System.out.println("Sonuç: "+sonuc);
                }
                else System.out.println("Bir sayı sıfıra bölünemez.");
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız.");
                System.out.println("---------MENÜ----------");
                System.out.println("1.Toplama \n 2.Çıkarma \n 3.Çarpma \n 4.Bölme");
                System.out.println("Seçiminiz: ");
                secim=gir.nextInt();
                break;
        }

    }
}
