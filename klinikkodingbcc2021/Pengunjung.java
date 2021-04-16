
package klinikkodingbcc2021;

import java.util.ArrayList;

/**
 *
 * @author Ibrahimsyah
 */
public class Pengunjung {
    private String nama;
    private String tanggalDatang;
    private ArrayList<Buku> pinjaman = new ArrayList();

    public Pengunjung(String nama, String tanggalDatang){
      this.nama = nama;
      this.tanggalDatang = tanggalDatang;
    }
    public String getNama(){
      return nama;
    }

    public String getTanggalDatang(){
      return tanggalDatang;
    }
    
    public void tambahPinjaman(Buku buku){
        this.pinjaman.add(buku);
        buku.decrementBuku();
    }
    
    public void getPinjaman(){
      System.out.println("-Buku yang Dipinjam:");
      for(int i = 0; i < pinjaman.size(); ++i){
        Buku bukuPinjaman = pinjaman.get(i);
        System.out.println("--Buku " + (i+1));
        System.out.println("---Judul: " + bukuPinjaman.getJudul());
        System.out.println("---Penulis: " + bukuPinjaman.getJudul());
        System.out.println("---Genre: " + bukuPinjaman.getJudul());
      }
    }
}
