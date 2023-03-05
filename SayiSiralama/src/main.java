import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner gir=new Scanner(System.in);

        System.out.println("Girilen Sayıları Sıralama Programı");
        System.out.println("3 adet sayı girin.");

        int s1, s2, s3;

        s1=gir.nextInt();
        s2=gir.nextInt();
        s3=gir.nextInt();

        if(s1>s2 && s1>s3){
            if(s2>s3) System.out.println(s1+">"+s2+">"+s3);
            else System.out.println(s1+">"+s3+">"+s2);
        }else if(s2>s1 && s2>s3){
            if(s1>s3) System.out.println(s2+">"+s1+">"+s3);
            else System.out.println(s2+">"+s3+">"+s1);
        }else if(s3>s1 && s3>s2){
            if(s1>s2) System.out.println(s3+">"+s1+">"+s2);
            else System.out.println(s3+">"+s2+">"+s1);
        }

    }
}
