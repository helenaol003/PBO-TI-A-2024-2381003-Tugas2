import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        tampilkanMenu();
        System.out.println("Masukkan pilihan Anda: ");
        int pilihan = input.nextInt();

        switch(pilihan){
            case 1:
                System.out.println("Masukkan sisi persegi: ");
                double sisi = input.nextDouble();

                double luasPersegi = hitungLuasPersegi(sisi);
                double kelilingPersegi = hitungKelilingPersegi(sisi);
                System.out.println("Luas persegi: " + luasPersegi);
                System.out.println("Keliling persegi: " + kelilingPersegi);
                break;
            case 2:
                System.out.println("Masukkan panjang persegi panjang: ");
                double panjang = input.nextDouble();
                System.out.println("Masukkan lebar persegi panjang: ");
                double lebar = input.nextDouble();

                double luasPersegiPanjang = hitungLuasPersegiPanjang(panjang, lebar);
                double kelilingPersegiPanjang = hitungKelilingPersegiPanjang(panjang, lebar);
                System.out.println("Luas persegi panjang: " + luasPersegiPanjang);
                System.out.println("Keliling persegi panjang: " + kelilingPersegiPanjang);
                break;
            case 3:
                System.out.println("Masukkan jari-jari lingkaran: ");
                double jariJari = input.nextDouble();

                double luasLingkaran = hitungLuasLingkaran(jariJari);
                double kelilingLingkaran = hitungKelilingLingkaran(jariJari);
                System.out.println("Luas lingkaran: " + luasLingkaran);
                System.out.println("Keliling lingkaran: " + kelilingLingkaran);
                break;
            default:
                System.out.println("Masukkan pilihan Anda (dari 1,2 ,atau 3)");
        }
    }

    public static double hitungLuasPersegi(double sisi){
        return sisi * sisi;
    }
    public static double hitungKelilingPersegi(double sisi){
        return 4 * sisi;
    }

    public static double hitungLuasPersegiPanjang(double panjang, double lebar){
        return panjang * lebar;
    }
    public static double hitungKelilingPersegiPanjang(double panjang, double lebar){
        return 2 * (panjang + lebar);
    }

    public static double hitungLuasLingkaran(double jariJari){
        return Math.PI * jariJari * jariJari;
    }
    public static double hitungKelilingLingkaran(double jariJari){
        return 2 * Math.PI * jariJari;
    }

    public static void tampilkanMenu(){
        System.out.println("Pilih bangun datar: ");
        System.out.println(" ");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi panjang");
        System.out.println("3. Lingkaran");
    }
}
