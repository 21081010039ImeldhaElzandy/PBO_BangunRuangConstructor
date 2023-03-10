package kubus;
public class Kubus {
    //atribut
    public int sisi;
    public int volume;
    
    //konstruktor
    public Kubus(int sisi) {
        this.sisi=sisi;
    }
    
    public Kubus(){
        this.sisi=0;
    }
    
    public void setSisi(int sisi) {
        this.sisi=sisi;
    }
    
    public void computeAndSetVolume() {
        int calculate_vol = this.sisi*this.sisi*this.sisi;
        this.volume = calculate_vol;
    }
    
    public int getVolume() {
        return this.volume;
    }
    
}
