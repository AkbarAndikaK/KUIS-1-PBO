package com.company;

import java.time.LocalDate;

class Mahasiswa {
    String nama;
    String jenis_kelamin;
    int NPM;
    String Nomor_WA;
    String fakultas;
    String prodi;
    Buku buku;
    Waktu waktu;

    void pinjambuku(Buku buku){
        this.buku = buku;
    }
    void bataswaktu(Waktu waktu){
        this.waktu = waktu;
    }

    Mahasiswa (String nama,String jenis_kelamin, int NPM, String Nomor_WA , String fakultas, String prodi){
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.NPM = NPM;
        this.Nomor_WA = Nomor_WA;
        this.fakultas = fakultas;
        this.prodi = prodi;
    }
    void datapeminjam(){
        System.out.println("\nPeminjam\n========================\n");
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jenis_kelamin);
        System.out.println("NPM           : " + NPM);
        System.out.println("Nomor WA      : " + Nomor_WA);
        System.out.println("Fakultas      : " + fakultas);
        System.out.println("Prodi         : " + prodi);
        System.out.println("\nBuku Yang Dipinjam\n========================\n");
        buku.databuku();
        System.out.println("\nBatas Waktu Peminjaman\n========================\n");
        waktu.bataswaktu();
    }

}
class Buku{
    String judul;
    String penulis;
    String penerbit;
    int tahun_terbit;

    Buku(String judul,String penulis, String penerbit, int tahun_terbit){
        this.judul = judul;
        this.penulis = penulis;
        this. penerbit = penerbit;
        this.tahun_terbit = tahun_terbit;
    }
    void databuku(){
        System.out.println("Judul   :" + judul);
        System.out.println("Penulis :" + penulis);
        System.out.println("Penerbit:" + penerbit);
        System.out.println("Tahun   :" + tahun_terbit);
    }
    void show() {
        System.out.println("\nBUKU\n========================\n");
        System.out.printf("Judul    : %s\n", this.judul);
        System.out.printf("Penulis  : %s\n", this.penulis);
        System.out.printf("Penerbit : %s\n", this.penerbit);
        System.out.printf("Tahun    : %s\n", this.tahun_terbit);
        System.out.println("\n========================");
    }

}
class Waktu{
    String pengembalian_buku;
    LocalDate tanggal_pinjam = LocalDate.now();

    Waktu(String pengembalian_buku){
        this.pengembalian_buku = pengembalian_buku;
    }
    void bataswaktu(){
        System.out.println("Tanggal Pinjam      :" + tanggal_pinjam.toString());
        System.out.println("Pengembalian Buku   :" + pengembalian_buku);
    }
}


public class Main {

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Akbar", "Laki-Laki", 2015061078, "0895606048362", "Teknik", "Informatika");
        Buku buku = new Buku("Matematika Diskrit", "Rinaldi Munir", "INFORMATIKA", 2020);
        Waktu bataswaktupeminjaman = new Waktu("2 minggu");

        buku.show();

        mhs.pinjambuku(buku);
        mhs.bataswaktu(bataswaktupeminjaman);

        mhs.datapeminjam();

    }
}
