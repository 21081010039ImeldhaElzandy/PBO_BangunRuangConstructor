package kubus;
public class Balok {
    public int panjang, lebar, tinggi;
    public int volume;
    
    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang=panjang;
        this.lebar=lebar;
        this.tinggi=tinggi;
    }
    
    public Balok() {
        this.panjang=0;
        this.lebar=0;
        this.tinggi=0;
    }
    
    public void setPanjang(int panjang) {
        this.panjang=panjang;
    }
    
    public void setLebar(int lebar) {
        this.lebar=lebar;
    }
    
    public void setTinggi(int tinggi) {
        this.tinggi=tinggi;
    }
    
    public void computeAndSetVolume() {
        int calculate_vol=this.panjang*this.lebar*this.tinggi;
        this.volume=calculate_vol;
    }
    
    public int getVolume() {
        return this.volume;
    }
}
