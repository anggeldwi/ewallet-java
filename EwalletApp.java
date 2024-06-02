import java.util.Scanner;

public class EwalletApp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { 
            System.out.print("Masukkan nama Anda: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan alamat Anda: ");
            String alamat = scanner.nextLine();

            Customer customer = new Customer(nama, alamat);

            while (true) {
                System.out.println("1. Cek Saldo");
                System.out.println("2. Topup");
                System.out.println("3. Transfer");
                System.out.println("4. Lihat Transaksi");
                System.out.println("5. Keluar");
                System.out.print("Pilih opsi: ");
                int pilihan = scanner.nextInt();
                scanner.nextLine(); 
                switch (pilihan) {
                    case 1:
                        customer.getEwallet().cekSaldo();
                        break;
                    case 2:
                        System.out.print("Masukkan jumlah topup: ");
                        double topupAmount = scanner.nextDouble();
                        scanner.nextLine(); 
                        System.out.print("Masukkan metode pembayaran: ");
                        String metodePembayaran = scanner.nextLine();
                        System.out.print("Masukkan nomor referensi: ");
                        String nomorReferensi = scanner.nextLine();
                        customer.getEwallet().topup(topupAmount, metodePembayaran, nomorReferensi);
                        break;
                    case 3:
                        System.out.print("Masukkan nama penerima: ");
                        String namaPenerima = scanner.nextLine();
                        System.out.print("Masukkan alamat penerima: ");
                        String alamatPenerima = scanner.nextLine();
                        Customer penerima = new Customer(namaPenerima, alamatPenerima);

                        System.out.print("Masukkan jumlah transfer: ");
                        double transferAmount = scanner.nextDouble();
                        scanner.nextLine(); 

                        customer.getEwallet().transfer(penerima, transferAmount);
                        break;
                    case 4:
                        customer.getEwallet().printTransactions();
                        break;
                    case 5:
                        System.out.println("Terima kasih telah menggunakan Ewallet App.");
                        return;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            }
        }
    }
}
