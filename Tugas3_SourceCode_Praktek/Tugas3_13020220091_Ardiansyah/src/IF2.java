/*
Nim  : 13020220091
Nama : Ardiansyah
Selasa, 12/03/2024
 */
import java.util.Scanner;
public class IF2 {
    public static void main(String[] args){
        int a;
        Scanner masukan=new Scanner(System.in);
        System.out.print ("Contoh IF dua kasus \n");
        System.out.print ("Ketikkan suatu nilai integer :");
        a = masukan.nextInt();
        if (a>=0){
            System.out.println ("Nilai a positif "+ a);
        }else{
            System.out.println ("Nilai a negatif "+ a);
        }
    }
}
