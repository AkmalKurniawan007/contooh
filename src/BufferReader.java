import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferReader {
    public static void main (String args[])
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nama;
        String alamat;

        try
        {
            System.out.print("Masukkan nama anda : "); // melakukan input nama
            nama = br.readLine();
            System.out.print("Masukkan alamat anda : "); // melakukan input nama
            alamat = br.readLine();
            System.out.println("===============================");
            System.out.println("Nama anda : " + nama); // menampilkan pesan nama
            System.out.println("Alamat anda : " + alamat); // menampilkan pesan alamat
        }
        catch(IOException eox) // menangkap kesalahan
        {
            System.out.println(eox);
        }
    }
}