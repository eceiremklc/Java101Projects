import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int matematikNotu, fizikNotu, kimyaNotu, turkceNotu, tarihNotu, muzikNotu;

        System.out.println("Matematik notunu giriniz: ");
        matematikNotu = inp.nextInt();

        System.out.println("Fizik notunu giriniz: ");
        fizikNotu = inp.nextInt();

        System.out.println("Kimya notunu giriniz: ");
        kimyaNotu = inp.nextInt();

        System.out.println("Turkce notunu giriniz: ");
        turkceNotu = inp.nextInt();

        System.out.println("Tarih notunu giriniz: ");
        tarihNotu = inp.nextInt();

        System.out.println("Muzik notunu giriniz: ");
        muzikNotu = inp.nextInt();

        int toplam=(matematikNotu + fizikNotu + kimyaNotu + turkceNotu + tarihNotu + muzikNotu);
        double ortalama=toplam/6.0;

        String durum=(ortalama<50)?"Kaldi":"Gecti";
        System.out.println("Ortalamanız: "+ortalama);
        System.out.println(durum);
    }
}
