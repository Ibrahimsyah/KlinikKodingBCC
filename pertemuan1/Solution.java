package pertemuan1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Buku> listBuku = new ArrayList();
        ArrayList<Pengunjung> listPengunjung = new ArrayList();

        int role = 1;
        // 1 pekerja, 2 pengunjung
        while (role != 0) {
            System.out.println("1. Pekerja");
            System.out.println("2. Pengunjung");
            System.out.print("Pilih role anda:");
            role = in.nextInt();
            in.nextLine();
            if (role == 1) {
                int menu = 1;
                while (menu != 0) {
                    System.out.println(" 1. Tambah buku");
                    System.out.println(" 2. Lihat Pengunjung");
                    System.out.print(" Menu: ");
                    menu = in.nextInt();
                    in.nextLine();
                    if (menu == 1) {
                        System.out.print("  Masukkan judul: ");
                        String judul = in.nextLine();
                        System.out.print("  Masukkan Stok: ");
                        int stok = in.nextInt();
                        in.nextLine();
                        System.out.print("  Masukkan penulis: ");
                        String penulis = in.nextLine();
                        System.out.print("  Masukkan genre: ");
                        String genre = in.nextLine();
                        Buku newBuku = new Buku(judul, stok, penulis, genre);
                        listBuku.add(newBuku);
                        listBuku.sort(new Sorter());
                        System.out.println("  Sukses menambah buku");
                    } else if (menu == 2) {
                        System.out.println("Total Pengunjung: " + listPengunjung.size());
                        for (int i = 0; i < listPengunjung.size(); ++i) {
                            Pengunjung pengunjung = (Pengunjung) listPengunjung.get(i);
                            System.out.println("Pengunjung ke " + (i + 1));
                            System.out.println("-Nama: " + pengunjung.getNama());
                            System.out.println("-Tanggal: " + pengunjung.getTanggalDatang());
                            pengunjung.getPinjaman();
                        }
                    }
                }
            } else if (role == 2) {
                System.out.print(" Masukkan nama anda: ");
                String nama = in.nextLine();
                System.out.print(" Masukkan tanggal masuk: ");
                String tanggalMasuk = in.nextLine();
                Pengunjung newPengunjung = new Pengunjung(nama, tanggalMasuk);
                listPengunjung.add(newPengunjung);
                int menu = 1;
                while (menu != 0) {
                    System.out.println(" 1. Lihat buku");
                    System.out.println(" 2. Pinjam buku");
                    System.out.print(" Menu: ");
                    menu = in.nextInt();
                    in.nextLine();
                    if (menu == 1) {
                        System.out.println("List buku:");
                        for (int i = 0; i < listBuku.size(); ++i) {
                            Buku buku = listBuku.get(i);
                            if (buku.getStok() != 0) {
                                System.out.println("ID Buku: " + i);
                                buku.cetakInfoBuku();
                            }
                        }
                    } else if (menu == 2) {
                        System.out.print("ID buku yang akan dipinjam: ");
                        int idBuku = in.nextInt();
                        Buku akanDipinjam = listBuku.get(idBuku);
                        if (akanDipinjam != null) {
                            newPengunjung.tambahPinjaman(listBuku.get(idBuku));
                            System.out.println("Sukses meminjam buku");
                        } else {
                            System.out.println("Buku tidak ada");
                        }
                    }
                }
            }
        }
    }

}

// Custom class untuk menangani sorting object dalam arraylist
class Sorter implements Comparator<Buku> {

    @Override
    public int compare(Buku o1, Buku o2) {
        return o1.getJudul().compareTo(o2.getJudul());
    }

}
