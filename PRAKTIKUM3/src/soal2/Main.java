package soal2;

import java.util.LinkedList;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Negara> daftarNegara = new LinkedList<>();
        HashMap<Integer, String> bulan = new HashMap<>();

        bulan.put(1, "Januari");
        bulan.put(2, "Februari");
        bulan.put(3, "Maret");
        bulan.put(4, "April");
        bulan.put(5, "Mei");
        bulan.put(6, "Juni");
        bulan.put(7, "Juli");
        bulan.put(8, "Agustus");
        bulan.put(9, "September");
        bulan.put(10, "Oktober");
        bulan.put(11, "November");
        bulan.put(12, "Desember");

        System.out.println("Banyak Negara:");
        int jumlahNegara = scanner.nextInt();
        scanner.nextLine(); 


        for (int i = 0; i < jumlahNegara; i++) {
            System.out.print("Negara: ");
            String nama = scanner.nextLine();
            System.out.print("Jenis Kepemimpinan: ");
            String jenisKepemimpinan = scanner.nextLine();
            System.out.print("Nama Pemimpin: ");
            String namaPemimpin = scanner.nextLine();

            Integer tanggalKemerdekaan = null;
            Integer bulanKemerdekaan = null;
            Integer tahunKemerdekaan = null;

            if (!jenisKepemimpinan.equalsIgnoreCase("monarki")) {
                System.out.print("Tanggal Merdeka: ");
                tanggalKemerdekaan = scanner.nextInt();
                System.out.print("Bulan Merdeka: ");
                bulanKemerdekaan = scanner.nextInt();
                System.out.print("Tahun Merdeka: ");
                tahunKemerdekaan = scanner.nextInt();
                scanner.nextLine(); 
            }

            Negara negara = new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
            daftarNegara.add(negara);
        }

        for (Negara negara : daftarNegara) {
            negara.tampilkanDetail(bulan);
            System.out.println(); 
        }

        scanner.close();
    }
}