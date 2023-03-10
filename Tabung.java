package kubus;
public class Tabung {
    public int radius, tinggi;
    public double volume;
    
    public Tabung(int radius, int tinggi) {
        this.radius=radius;
        this.tinggi=tinggi;
    }
    
    public Tabung() {
        this.radius=0;
        this.tinggi=0;
    }
    
    public void setRadius(int radius) {
        this.radius=radius;
    }
    
    public void setTinggi(int tinggi) {
        this.tinggi=tinggi;
    }
    
    public void computeAndSetVolume() {
        double calculate_vol=Math.PI*this.radius*this.radius*this.tinggi;
        this.volume=calculate_vol;
    }
    
    public double getVolume() {
        return this.volume;
    }
}
