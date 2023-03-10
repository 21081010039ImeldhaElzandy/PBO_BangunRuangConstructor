package kubus;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan = 0;
        
        while (pilihan != 6) {
        System.out.println("----------------------------------------");
        System.out.println("\tMENU HITUNG BANGUN RUANG\t");
        System.out.println("----------------------------------------");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. TABUNG");
        System.out.println("4. LIMAS SEGI EMPAT");
        System.out.println("5. BOLA");
        System.out.println("6. KELUAR");
        System.out.print("Pilihan Anda = ");
        pilihan = input.nextInt();
        System.out.println("----------------------------------------");
        System.out.println("");
        
        switch(pilihan) {
            case 1 :
                Kubus kotak = new Kubus(5);
                kotak.computeAndSetVolume();
                System.out.println("Volume Kubus dengan sisi = "+kotak.sisi+" adalah "+kotak.getVolume());
        
                Kubus kotak1 = new Kubus();
                System.out.println("Volume Kubus dengan sisi = "+kotak1.sisi+" adalah "+kotak1.getVolume());
                break;
        
            case 2 :
                Balok b1 = new Balok(10,5,7);
                b1.computeAndSetVolume();
                System.out.println("Volume Balok dengan panjang = "+b1.panjang+" lebar "+b1.lebar+
                " tinggi "+b1.tinggi+" adalah "+b1.getVolume());
                
                Balok b0 = new Balok();
                System.out.println("Volume Balok dengan panjang = "+b0.panjang+" lebar "+b0.lebar+
                " tinggi "+b0.tinggi+" adalah "+b0.getVolume());
                break;
                
            case 3 :
                Tabung t1 = new Tabung(10,20);
                t1.computeAndSetVolume();
                System.out.println("Volume Tabung dengan radius "+t1.radius+" dan tinggi "+t1.tinggi+
                        " adalah "+t1.getVolume());
                
                Tabung t0 = new Tabung();
                System.out.println("Volume Tabung dengan radius "+t0.radius+" dan tinggi "+t0.tinggi+
                        " adalah "+t0.getVolume());
                break;
                
            case 4 :
                LimasSegiEmpat limas = new LimasSegiEmpat(4, 7);
                limas.computeAndSetVolume();
                System.out.println("Volume Limas Segi Empat dengan sisi "+limas.sisi+" dan tinggi "+limas.tinggi+
                        " adalah "+limas.getVolume());
                
                LimasSegiEmpat limas0 = new LimasSegiEmpat();
                System.out.println("Volume Limas Segi Empat dengan sisi "+limas0.sisi+" dan tinggi "+limas0.tinggi+
                        " adalah "+limas0.getVolume());
                break;
                
            case 5 :
                Bola bola = new Bola(5);
                bola.computeAndSetVolume();
                System.out.println("Volume Bola dengan radius "+bola.radius+" adalah "+bola.getvolume());
                break;
                
            case 6 :
                System.out.println("TERIMAKASIH");
                break;
            default :
                System.out.println("PILIHAN YANG ANDA PILIH SALAH");
                break;
        }
        }
    }
}