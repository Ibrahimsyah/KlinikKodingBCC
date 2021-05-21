/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author Ibrahimsyah
 */
abstract class Book {

    String title;

    public Book(String title) {
        this.title = title;
    }

    void baca() {
        System.out.println("Buku sedang dibaca");
    }

    abstract void jual();
}

class Novel extends Book {

    public Novel(String title) {
        super(title);
    }

    @Override
    void jual() {
        System.out.println("Novel dijual di toko buku");
    }

}

class Majalah extends Book {

    public Majalah(String title) {
        super(title);
    }

    @Override
    void jual() {
        System.out.println("Majalah dijual di supermarket");
    }

}

public class AbstractPlayground {

    public static void main(String[] args) {
        Book novel = new Novel("Novel1");
        novel.jual();
        novel.baca();

        Book majalah = new Majalah("Majalah1");
        majalah.jual();
        majalah.baca();

    }
}
