import java.util.Scanner;
public class main {
    public static void main(String[] args){
        System.out.println("Daire için: ");

        int yariCap;
        Scanner inp=new Scanner(System.in);
        System.out.println("Yarıçap giriniz: ");
        yariCap=inp.nextInt();
        double alan=(Math.PI*yariCap*yariCap);
        double cevre=(Math.PI*2*yariCap);

        System.out.println("Daire alanı: "+alan);
        System.out.println("Daire çevresi: "+cevre);

        System.out.println("--------------------------------------------------");

        System.out.println("Daire dilimi için: ");
        System.out.println("Yarıçap giriniz: ");
        int yariCap2;
        yariCap2=inp.nextInt();
        System.out.println("Merkez açıyı giriniz: ");
        int merkezAci;
        merkezAci=inp.nextInt();
        double dilimAlan=(3.14*(yariCap2*yariCap2)*merkezAci)/360;

        System.out.println("Daire diliminin alanı: "+dilimAlan);
    }
}
