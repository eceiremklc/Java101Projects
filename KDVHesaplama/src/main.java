import java.util.Scanner;
public class main {
    public static void main(String[] args){
        int tutar;
        int kdvTutari = 0;
        int kdvliTutar = 0;
        Scanner inp=new Scanner(System.in);
        System.out.println("Tutar giriniz: ");
        tutar=inp.nextInt();
        if(0 < tutar && tutar < 1000){
            kdvTutari=(tutar*18)/100;
            kdvliTutar=tutar+((tutar*18)/100);
        }
        if(tutar > 1000){
            kdvTutari=(tutar*8)/100;
            kdvliTutar=tutar+((tutar*8)/100);
        }
        System.out.println("KDV'siz Fiyat: "+tutar);
        System.out.println("KDV'li Fiyat: "+kdvliTutar);
        System.out.println("KDV Tutarı: "+kdvTutari);
    }
}
