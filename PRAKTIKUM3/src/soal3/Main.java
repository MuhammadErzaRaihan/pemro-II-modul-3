package soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();
            switch (pilihan) {
                case 1:
                    tambahMahasiswa();
                    break;
                case 2:
                    hapusMahasiswa();
                    break;
                case 3:
                    cariMahasiswa();
                    break;
                case 4:
                    tampilkanDataMahasiswa();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
               
                default:
                    System.out.println("Error. Silakan coba lagi.");
            }
        } while (pilihan != 0);
    }

    private static void tambahMahasiswa() {
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM Mahasiswa(harus unik): ");
        String nim = scanner.nextLine();
        Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
        mahasiswaList.add(mahasiswa);
        System.out.println("Mahasiswa " + nama + " ditambahkan.");
    }

    private static void hapusMahasiswa() {
        System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
        String nim = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < mahasiswaList.size(); i++) {
            if (mahasiswaList.get(i).getNim().equals(nim)) {
                mahasiswaList.remove(i);
                found = true;
                System.out.println("Mahasiswa dengan NIM " + nim + " dihapus.");
                break;
            }
        }

        if (!found) {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }

    private static void cariMahasiswa() {
        System.out.print("Masukkan NIM Mahasiswa yang ingin dicari: ");
        String nim = scanner.nextLine();
        boolean found = false;

        for (Mahasiswa mahasiswa : mahasiswaList) {
            if (mahasiswa.getNim().equals(nim)) {
                System.out.println("Nama: " + mahasiswa.getNama() + ", NIM: " + mahasiswa.getNim());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }

    private static void tampilkanDataMahasiswa() {
        if (mahasiswaList.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.");
        } else {
            System.out.println("Daftar Mahasiswa:");
            for (Mahasiswa mahasiswa : mahasiswaList) {
                System.out.println( "NIM: " + mahasiswa.getNim() + ", Nama: " + mahasiswa.getNama());
            }
        }
    }
}