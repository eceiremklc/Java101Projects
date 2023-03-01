import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        double armutkg, elmakg, domateskg, muzkg, patlicankg;

        System.out.println("Armut kaç kg?");
        armutkg = inp.nextDouble();

        System.out.println("Elma kaç kg?");
        elmakg = inp.nextDouble();

        System.out.println("Domates kaç kg?");
        domateskg = inp.nextDouble();

        System.out.println("Muz kaç kg?");
        muzkg = inp.nextDouble();

        System.out.println("Patlıcan kaç kg?");
        patlicankg = inp.nextDouble();

        double toplamTutar=((armutkg*2.14)+(elmakg*3.67)+(domateskg*1.11)+(muzkg*0.95)+(patlicankg*5));

        System.out.println("Toplam tutar: "+toplamTutar+"TL");
    }
}
