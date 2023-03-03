import java.util.Scanner;
public class main {
    public static void main(String[] args){
        int mat, fizik, turkce, kimya, muzik;
        int toplam=0, ders=0;

        Scanner gir=new Scanner(System.in);

        System.out.println("Not Ortalaması Hesaplama");

        System.out.println("Matematik notunuzu girin: ");
        mat=gir.nextInt();

        if(0<mat && mat<100){
            toplam+=mat;
            ders++;
        }

        System.out.println("Fizik notunuzu girin: ");
        fizik=gir.nextInt();

        if(0<fizik && fizik<100){
            toplam+=fizik;
            ders++;
        }

        System.out.println("Türkçe notunuzu girin: ");
        turkce=gir.nextInt();

        if(0<turkce && turkce<100){
            toplam+=turkce;
            ders++;
        }

        System.out.println("Kimya notunuzu girin: ");
        kimya=gir.nextInt();

        if(0<kimya && kimya<100){
            toplam+=kimya;
            ders++;
        }

        System.out.println("Müzik notunuzu girin: ");
        muzik=gir.nextInt();

        if(0<muzik && muzik<100){
            toplam+=muzik;
            ders++;
        }

        double ortalama = toplam/ders;

        if(ortalama<55)
            System.out.println(ortalama+"ile kaldınız.");
        else
            System.out.println(ortalama+"ile geçtiniz");
    }
}
