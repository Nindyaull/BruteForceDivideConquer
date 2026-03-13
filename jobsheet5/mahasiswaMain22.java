package jobsheet5;

import java.util.Scanner;

public class mahasiswaMain22 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    mahasiswa22[] daftarMhs = new mahasiswa22[8];
    daftarMhs[0] = new mahasiswa22("Ahmad", "220101001", 2022, 78, 82);
    daftarMhs[1] = new mahasiswa22("Budi", "220101002", 2022, 85, 88);
    daftarMhs[2] = new mahasiswa22("Cindy", "220101003", 2021, 90, 87);
    daftarMhs[3] = new mahasiswa22("Dian", "220101004", 2021, 76, 79);
    daftarMhs[4] = new mahasiswa22("Eko", "220101005", 2023, 92, 95);
    daftarMhs[5] = new mahasiswa22("Fajar", "220101006", 2020, 88, 85);
    daftarMhs[6] = new mahasiswa22("Gina", "220101007", 2023, 80, 83);
    daftarMhs[7] = new mahasiswa22("Hadi", "220101008", 2020, 82, 84);

    mahasiswa22 hitung = new mahasiswa22();

    int menu = 0;

    while (menu != 5) {
        System.out.println("\n=======================================================");
        System.out.println("                 DATA NILAI KAMPUS");
        System.out.println("=======================================================");
        System.out.println("1. Tampilkan Seluruh Data Mahasiswa");
        System.out.println("2. Nilai UTS Tertinggi");
        System.out.println("3. Nilai UTS Terendah");
        System.out.println("4. Rata-Rata Nilai UAS");
        System.out.println("5. Keluar dari Program");
        System.out.println("-------------------------------------------------------");
        System.out.print("Masukkan Pilihan Anda (1-5): ");
        menu = sc.nextInt();
        System.out.println();

        switch (menu) {
            case 1:
                System.out.println("--- Daftar Nilai Mahasiswa --- ");
                for (int i = 0; i < daftarMhs.length; i++) {
                    System.out.printf("%-10s %-15s %-15d %-10d %-10d\n", 
                    daftarMhs[i].nama, daftarMhs[i].nim, daftarMhs[i].tahunMasuk, daftarMhs[i].nilaiUTS, daftarMhs[i].nilaiUAS);
                }
                break;
            case 2:
                int tertinggiUTS = hitung.tertinggiDC(daftarMhs, 0, daftarMhs.length-1);
                System.out.println("Hasil: Nilai UTS Tertinggi Adalah: " + tertinggiUTS);
                break;
            case 3:
                int terendahUTS = hitung.terendahDC(daftarMhs, 0, daftarMhs.length-1);
                System.out.println("Hasil: Nilai UTS Terendah Adalah: " + terendahUTS);
                break;
            case 4:
                double rataRataUAS = hitung.rataUASBF(daftarMhs);
                System.out.println("Hasil: Rata-Rata Nilai UAS Adalah: " + rataRataUAS);
                break;
            case 5:
                System.out.println("Program Selesai, Terimakasih! :)");
            default:
                System.out.println("Pilihan Tidak Valid! Silakan Masukkan Angka 1-5!");
                break;  
        }
    }  
    sc.close(); 
   } 
}
