import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String plat_nomor;
        System.out.println("Masukan plat nomor: ");
        try {
            plat_nomor = reader.readLine();
            reader.close();
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan");
            return;
        }
        if (plat_nomor.length() != 4) {
            System.out.println("Plat nomor harus terdiri dari 4 angka");
            return;
        }
        int jumlah_genap = 0;
        try {
            for (int i = 0; i < plat_nomor.length(); i++) {
                int angka = Integer.parseInt(String.valueOf(plat_nomor.charAt(i)));
                if (angka % 2 == 0) {
                    jumlah_genap++;
                }
            }
        } catch (Exception ex) {
            System.out.println("Plat nomor hanya boleh terdiri dari angka");
            return;
        }
        boolean valid = jumlah_genap > 1;
        System.out.println("Jumlah angka genap: "+jumlah_genap);
        System.out.println("Status plat nomor: "+ (valid ? "Valid" : "Invalid"));

    }
}