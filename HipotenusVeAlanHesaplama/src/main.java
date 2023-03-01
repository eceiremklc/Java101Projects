import java.util.Scanner;
public class main {
    public static void main(String[] args){
        System.out.println("Hipotenus hesaplayan program:");
        int dikKenar1, dikKenar2;
        Scanner inp = new Scanner(System.in);
        System.out.println("1. dik kenarin uzunlugu: ");
        dikKenar1=inp.nextInt();
        System.out.println("2. dik kenarin uzunlugu: ");
        dikKenar2=inp.nextInt();
        double hipotenus = Math.sqrt((dikKenar1*dikKenar1)+(dikKenar2*dikKenar2));
        System.out.println("Hipotenus: "+hipotenus);
        System.out.println("--------------------------------------------------------");
        System.out.println("Cevre hesaplayan program:");
        int a, b, c;
        System.out.println("Ucgenin kenarlarini girin: ");
        a=inp.nextInt();
        b=inp.nextInt();
        c=inp.nextInt();
        int cevre = a + b + c;
        int u = cevre/2;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Kenarlari girilen ucgenin alani: " +alan);
    }
}
