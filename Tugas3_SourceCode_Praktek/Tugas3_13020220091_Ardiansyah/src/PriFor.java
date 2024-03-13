/*
Nim  : 13020220091
Nama : Ardiansyah
Selasa, 12/03/2024
 */
import java.util.Scanner;
public class PriFor {
    public static void main(String[] args){
        int i,N;
        Scanner masukan=new Scanner(System.in);

        System.out.println ("Baca N, print 1 s/d N ");
        System.out.print ("N = ");

        N=masukan.nextInt();
        for (i = 1; i <= N; i++){
            System.out.println (i); };
            System.out.println ("Akhir program \n");
    }
}
