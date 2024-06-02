public class Transfer extends Transaction {
    private Customer penerima;

    public Transfer(double nominal, Customer pengirim, Customer penerima) {
        super(nominal, pengirim);
        this.penerima = penerima;
    }

    public Customer getPenerima() {
        return penerima;
    }

    public void setPenerima(Customer penerima) {
        this.penerima = penerima;
    }

    @Override
    public void cetakInformasiTransaksi() {
        System.out.println("Transfer: " + nominal + " | Pengirim: " + customer.getNama() + " | Penerima: " + penerima.getNama() + " | Tanggal: " + tanggal);
    }
}
