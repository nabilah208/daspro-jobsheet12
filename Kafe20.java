import java.util.Scanner;
//public class Kafe20 {
    //public static void ubahNama(String nama) {
        //nama = "Tamu";
        //System.out.println("Di dalam fungsi: " + nama);
    //}
    //public static void main(String[] args) {
        //String nama = "Andi";
        //ubahNama(nama);
        //System.out.println("Di main: " + nama);
    //}
//}
public class Kafe20 {
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
       }
       // if (jamKunjung >= 14 && jamKunjung <= 16) {
           // System.out.println("Happy Hour! Diskon 20% untuk semua minuman");
        //}
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }
    //public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Masukkan nama pelanggan: ");
       //String nama = sc.nextLine();
        //System.out.print("Apakah member? (y/n): ");
        //String jawab = sc.nextLine();
        //boolean isMember = jawab.equalsIgnoreCase("y");
        //System.out.print("Masukkan jam kunjung: ");
        //int jam = sc.nextInt();
        //Menu(nama, isMember, jam);
    //}
//}
public static int hitungTotalHarga20(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true);
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        int totalBayar = hitungTotalHarga20(pilihanMenu, banyakItem);
        System.out.println("Total harga untuk pesanan Anda: Rp" + totalBayar);
    }
}