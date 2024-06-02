import java.util.ArrayList;
import java.util.List;

class Ewallet {
    private double saldo;
    private List<Transaction> transactions;
    private Customer customer; // Tambahkan referensi ke Customer

    public Ewallet(Customer customer) {
        this.saldo = 0;
        this.transactions = new ArrayList<>();
        this.customer = customer; // Set referensi ke Customer
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void cekSaldo() {
        System.out.println("Saldo saat ini: " + saldo);
    }

    public void topup(double amount, String metodePembayaran, String nomorReferensi) {
        this.saldo += amount;
        Topup topup = new Topup(amount, metodePembayaran, nomorReferensi, this.customer);
        transactions.add(topup);
    }

    public void transfer(Customer penerima, double amount) {
        if (this.saldo >= amount) {
            this.saldo -= amount;
            Transfer transfer = new Transfer(amount, this.customer, penerima);
            transactions.add(transfer);
            penerima.getEwallet().receiveTransfer(amount, transfer);
        } else {
            System.out.println("Saldo tidak mencukupi untuk transfer.");
        }
    }

    public void receiveTransfer(double amount, Transfer transfer) {
        this.saldo += amount;
        transactions.add(transfer);
    }

    public void printTransactions() {
        for (Transaction transaction : transactions) {
            transaction.cetakInformasiTransaksi();
        }
    }
}
