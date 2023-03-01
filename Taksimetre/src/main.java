import java.util.Scanner;
public class main {
    public static void main(String[] args){
        int km;
        Scanner inp=new Scanner(System.in);
        System.out.println("Gidilen km giriniz: ");
        km=inp.nextInt();
        double tutar;
        tutar=10+(km*2.2);
        if(tutar<20) tutar=20;
        System.out.println("Tutar: "+tutar);
    }
}
