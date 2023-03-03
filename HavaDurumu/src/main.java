import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner gir=new Scanner(System.in);
        System.out.println("Hava sıcaklığına göre etkinlik önerme programına hoş geldiniz!");
        System.out.println("Lütfen hava sıcaklığını giriniz: ");

        int havaSicakligi;

        havaSicakligi=gir.nextInt();

        if(havaSicakligi<5) System.out.println("Bu havada kayak yapabilirsin.");
        if(5<=havaSicakligi && havaSicakligi<=10) System.out.println("Bu havada sinemaya gidebilirsin.");
        if(10<havaSicakligi && havaSicakligi<=15) System.out.println("Bu havada sinemaya gidebilir veya piknik yapabilirsin.");
        if(15<havaSicakligi && havaSicakligi<=25) System.out.println("Bu havada pikniğe gidebilirsin.");
        if(havaSicakligi>25) System.out.println("Bu havada yüzmeye gidebilirsin.");
    }
}
