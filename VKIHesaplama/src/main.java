import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);

        double kilo;
        double boy;
        double vki;

        System.out.println("Lütfen kg cinsinden kilonuzu girin:");
        kilo=inp.nextDouble();
        System.out.println("Lütfen metre cinsinden boyunuzu girin (0,00):");
        boy=inp.nextDouble();
        vki=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: "+vki);
    }
}
