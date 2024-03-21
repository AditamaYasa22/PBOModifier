public class Mahasiswa {
    private String nama;
    private int umur;

    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return this.nama;
    }

    public int getUmur() {
        return this.umur;
    }

    public void printDataMahasiswa() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Umur: " + this.umur);
    }
}