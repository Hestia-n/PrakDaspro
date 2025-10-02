import java.util.Scanner;

public class ifCetakKRS14 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("--- Cetak KRS ---");
    System.out.println("Apakah UKT sudah lunas? (true/false)");
    boolean uktLunas = sc.nextBoolean();

    //if (uktLunas) {  ------------ BARIS IF ELSE SEBELUMNYA
        //System.out.println("Pembayaran UKT terverifikasi.");
        //System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
    //}
    //else {
        //System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.");
    //}

    System.out.println((uktLunas) 
    ? "KRS ditampilkan" 
    : "KRS tidak dapat ditampilkan");
    }
}