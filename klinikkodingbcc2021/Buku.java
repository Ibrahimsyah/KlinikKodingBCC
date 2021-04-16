package klinikkodingbcc2021;

/**
 *
 * @author Ibrahimsyah
 */
public class Buku {
  private String judul;
  private int stok;
  private String penulis;
  private String genre;

  public Buku() {}

  public Buku(String judul, int stok, String penulis, String genre) {
    this.judul = judul;
    this.stok = stok;
    this.penulis = penulis;
    this.genre = genre;
  }

  public String getJudul() {
    return judul;
  }

  public int getStok() {
    return stok;
  }

  public String getPenulis() {
    return penulis;
  }

  public String getGenre() {
    return genre;
  }

  public void decrementBuku(){
    this.stok--;
  }
  
  public void cetakInfoBuku(){
      System.out.println("Judul: " + this.judul);
      System.out.println("Penulis: " + this.penulis);
      System.out.println("Genre: " + this.genre);
      System.out.println("Stok: " + this.stok);
      System.out.println("===============");
  }
}
