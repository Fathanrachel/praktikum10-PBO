public class Sopir {
    String nama;
    String tujuan;

    public Sopir(String nama, Mobil mobil ,String tujuan) {
        this.nama = nama;
        this.tujuan = tujuan;
    }

    public void mengemudi() {
        System.out.println( this.nama + " sedang mengemudikan mobil menuju ke " + this.tujuan);
    }
}
