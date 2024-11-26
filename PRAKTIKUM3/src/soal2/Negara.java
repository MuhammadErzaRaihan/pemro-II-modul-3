package soal2;

import java.util.HashMap;

public class Negara {
    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private Integer tanggalKemerdekaan;
    private Integer bulanKemerdekaan;
    private Integer tahunKemerdekaan;

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, Integer tanggalKemerdekaan, Integer bulanKemerdekaan, Integer tahunKemerdekaan) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }

    public void tampilkanDetail(HashMap<Integer, String> bulan) {
        System.out.print("Negara " + nama + " mempunyai ");
        if (jenisKepemimpinan.equalsIgnoreCase("monarki")) {
            System.out.println("Raja bernama " + namaPemimpin);
        } else if (jenisKepemimpinan.equalsIgnoreCase("presiden")) {
            System.out.println("Presiden bernama " + namaPemimpin);
            System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggalKemerdekaan + " " + bulan.get(bulanKemerdekaan) + " " + tahunKemerdekaan);
        } else {
            System.out.println("Pemimpin bernama " + namaPemimpin);
            System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggalKemerdekaan + " " + bulan.get(bulanKemerdekaan) + " " + tahunKemerdekaan);
        }
    }
}
