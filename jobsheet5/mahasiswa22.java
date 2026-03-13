package jobsheet5;

public class mahasiswa22 {
    String nama;
    String nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    public mahasiswa22(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    
    public mahasiswa22() {

    }

    public int tertinggiDC(mahasiswa22 arr[], int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }
        int mid = (l+r) / 2;
        int ltinggi = tertinggiDC(arr, l, mid);
        int rtinggi = tertinggiDC(arr, mid + 1, r);
        if (ltinggi > rtinggi) {
            return ltinggi;
        } else {
            return rtinggi;
        }
    }

    public int terendahDC(mahasiswa22 arr[], int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }
        int mid = (l+r) / 2;
        int lrendah = terendahDC(arr, l, mid);
        int rrendah = terendahDC(arr, mid + 1, r);

        if (lrendah < rrendah){
            return lrendah;
        } else {
            return rrendah;
        }
    }

    public double rataUASBF(mahasiswa22 arr[]) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i].nilaiUAS;
        }
        return total / arr.length;
    }
}
