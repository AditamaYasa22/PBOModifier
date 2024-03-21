public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Marquez", 20);

        System.out.println("Data Mahasiswa:");
        System.out.println("Nama: " + mahasiswa1.getNama());
        System.out.println("Umur: " + mahasiswa1.getUmur());


        System.out.println("Jumlah mahasiswa: " + JumlahMahasiswa.jumlah);
    }
}
