package pertemuan1;

/**
 *
 * @author Ibrahimsyah
 */
class Kucing {

    private static int penandaNomor = 1;

    //Class member
    private String nama;
    private int umur;
    private int nomorKalung;

    public Kucing() {
        this.nomorKalung = penandaNomor;
        penandaNomor += 1;
    }

    public Kucing(String nama, int umur) {
        this();
        this.nama = nama;
        this.umur = umur;
    }

    public Kucing(int umur, String nama) {
        this();
        this.nama = nama;
        this.umur = umur;
    }

    //Class member
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public void makan() {
        System.out.println(this.nama + " sedang makan");
    }

    public void makan(String makanan) {
        System.out.println(this.nama + " sedang makan " + makanan);
    }

    public static void cetakKucing(Kucing kucing) {
        System.out.println("Nama: " + kucing.nama);
        System.out.println("Umur: " + kucing.umur);
        System.out.println("Nomor Kalung: " + kucing.nomorKalung);
        System.out.println("=============");
    }
}

public class KlinikKodingBCC2021 {

    public static void main(String[] args) {
        Kucing cat = new Kucing();
        System.out.println(cat.getNama());
        System.out.println(cat.getUmur());
        cat.makan();
        System.out.println("===========");

        Kucing kitty = new Kucing("Martin", 35);
        System.out.println(kitty.getNama());
        kitty.setNama("Smitty");
        System.out.println(kitty.getNama());
        System.out.println(kitty.getUmur());
        kitty.makan();
        kitty.makan("Pizza");
        System.out.println("==========");

        //Cara 1
        Kucing kucing1 = new Kucing("Budi", 2);
        kucing1.setNama("Ani");

        //Cara 2
        Kucing kucing2 = new Kucing();
        kucing2.setNama("Budi");
        kucing2.setUmur(2);

        Kucing.cetakKucing(kucing1);
        Kucing.cetakKucing(kucing2);
    }
}
