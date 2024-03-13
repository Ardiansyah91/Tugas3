/*
Nim  : 13020220091
Nama : Ardiansyah
Selasa, 12/03/2024
 */
import java.util.Scanner;
public class Konstant {
    public static void main(String[] args){
        final float PHI = 3.141f;
        float r;
        Scanner masukan = new Scanner(System.in);

        System.out.print("Jari-Jari Lingkaran = ");
        r = masukan.nextFloat();

        System.out.println("Luas Lingkaran = "+ (PHI * r * r));
        System.out.println("AKhir Program");
    }
}
