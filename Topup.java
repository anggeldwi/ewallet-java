class Topup extends Transaction {
    private String nomorReferensi;
    private String metodePembayaran;

    public Topup(double nominal, String metodePembayaran, String nomorReferensi, Customer customer) {
        super(nominal, customer);
        this.nomorReferensi = nomorReferensi;
        this.metodePembayaran = metodePembayaran;
    }

    public String getNomorReferensi() {
        return nomorReferensi;
    }

    public void setNomorReferensi(String nomorReferensi) {
        this.nomorReferensi = nomorReferensi;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    @Override
    public void cetakInformasiTransaksi() {
        System.out.println("Topup: " + nominal + " | Metode: " + metodePembayaran + " | Ref: " + nomorReferensi + " | Tanggal: " + tanggal);
    }
}
