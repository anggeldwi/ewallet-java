class Customer {
    private String nama;
    private String alamat;
    private Ewallet ewallet;

    public Customer(String nama, String ewallet) {
        this.nama = nama;
        this.ewallet = new Ewallet(this); // Set Customer di Ewallet
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Ewallet getEwallet() {
        return ewallet;
    }

    public void setEwallet(Ewallet ewallet) {
        this.ewallet = ewallet;
    }
}
