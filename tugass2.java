import java.util.Scanner;

public class tugass2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double luas = 0;
        double keliling = 0;

        tampilkanMenu();
        System.out.println("Masukkan pilihan Anda: ");
        int pilihan = input.nextInt();

        switch(pilihan){
            case 1:
                System.out.println("Masukkan sisi persegi: ");
                double sisi = input.nextDouble();

                hitungLuasPersegi(luas, sisi);
                hitungKelilingPersegi(keliling, sisi);
                break;
            case 2:
                System.out.println("Masukkan panjang persegi panjang: ");
                double panjang = input.nextDouble();
                System.out.println("Masukkan lebar persegi panjang: ");
                double lebar = input.nextDouble();

                hitungLuasPersegiPanjang(luas, panjang, lebar);
                hitungKelilingPersegiPanjang(keliling, panjang, lebar);
                break;
            case 3:
                System.out.println("Masukkan jari-jari lingkaran: ");
                double jariJari = input.nextDouble();

                hitungLuasLingkaran(luas, jariJari);
                hitungKelilingLingkaran(keliling, jariJari);
                break;
            default:
                System.out.println("Masukkan pilihan antara 1,2 atau 3");
        }
    }

    public static void tampilkanMenu(){
        System.out.println("Pilih bangun datar: ");
        System.out.println(" ");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi panjang");
        System.out.println("3. Lingkaran");
    }

    public static double hitungLuasPersegi(double luas, double sisi){
        luas = sisi * sisi;
        System.out.println("Luas persegi: " + luas);
        return luas;
    }
    public static double hitungKelilingPersegi(double keliling, double sisi){
        keliling = 4 * sisi;
        System.out.println("Keliling persegi: " + keliling);
        return keliling;
    }

    public static double hitungLuasPersegiPanjang(double luas, double panjang, double lebar){
        luas = panjang * lebar;
        System.out.println("Luas persegi panjang: " + luas);
        return luas;
    }
    public static double hitungKelilingPersegiPanjang(double keliling2, double panjang, double lebar){
        keliling2 = 2 * (panjang + lebar);
        System.out.println("Keliling persegi panjang: " + keliling2);
        return keliling2;
    }

    public static double hitungLuasLingkaran(double luas3, double jariJari){
        luas3 = Math.PI * jariJari * jariJari;
        System.out.println("Luas lingkaran: " + luas3);
        return luas3;
    }
    public static double hitungKelilingLingkaran(double keliling3, double jariJari){
        keliling3 = 2 * Math.PI * jariJari;
        System.out.println("Keliling lingkaran: " + keliling3);
        return keliling3;
    }

}
