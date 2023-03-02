import java.util.Scanner;
public class main {
    public static void main(String[] args){
        String kullaniciAdi, sifre, secim, yeniSifre;

        Scanner gir=new Scanner(System.in);

        System.out.println("Kullanici Adiniz: ");
        kullaniciAdi=gir.nextLine();

        System.out.println("Sifreniz: ");
        sifre=gir.nextLine();

        if(kullaniciAdi.equals("admin") && sifre.equals("admin")){
            System.out.println("Başarılı bir şekilde giriş yaptınız.");
        }
        else{
            System.out.println("Şifre yanlış, şifrenizi sıfırlamak ister misiniz?(e/h)");
            secim=gir.nextLine();
            if(secim.equals("e")) {
                System.out.println("Yeni şifrenizi giriniz: ");
                yeniSifre=gir.nextLine();
                while(yeniSifre.equals("admin")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    System.out.println("Yeni şifrenizi giriniz: ");
                    yeniSifre=gir.nextLine();
                }
                System.out.println("Şifre yenileme başarılı.");
            }
        }
    }
}
