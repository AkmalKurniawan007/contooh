import java.io.BufferedReader;
import  java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class string {
    public static void main (String[] args) throws IOException {
        String nama = "Poltek Harber" ;
        System.out.println(nama.length());
        char karakter_pertama = nama.charAt(0);
        char karakter_terakhir = nama.charAt(12);
        System.out.println("Karakter pertama adalah : " + karakter_pertama);
        System.out.println("Karakter terakhir adalah : " + karakter_terakhir);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukan kalimat = " );
        String p = reader.readLine();
        char huruf = 'r';
        int jumlah_huruf=0;
        for(int conter=0;conter<p.length();conter++){
            if(p.charAt(conter)==huruf){
                 jumlah_huruf++;
            }
        }
    }
}
