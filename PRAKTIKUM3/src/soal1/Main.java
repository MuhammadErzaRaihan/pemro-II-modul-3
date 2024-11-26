package soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     LinkedList<Dadu> daduList = new LinkedList<>();

     int BanyakDadu = scanner.nextInt();
     
     for (int i = 0; i < BanyakDadu; i++) {
         Dadu dadu = new Dadu();
         daduList.add(dadu);
     }
     
     int totalNilai = 0;
     for (int i = 0; i < daduList.size(); i++) {
         int nilai = daduList.get(i).getNilai();
         System.out.println("Dadu ke-" + (i + 1) + " bernilai " + nilai);
         totalNilai += nilai;
     }
     
 
     System.out.println("Total nilai dadu keseluruhan " + totalNilai);
     
     scanner.close();
 }
}