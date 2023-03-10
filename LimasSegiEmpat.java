package kubus;
public class LimasSegiEmpat {
    public int sisi, tinggi;
    public double luas_alas, volume;
    
    public LimasSegiEmpat(int sisi, int tinggi){
        this.sisi=sisi;
        this.tinggi=tinggi;
        this.luas_alas=sisi*sisi;
    }
    
    public LimasSegiEmpat(){
        this.sisi=0;
        this.tinggi=0;
        this.luas_alas=0;
    }
    
    public void setSisi(int sisi){
        this.sisi=sisi;
    }
    
    public void setTinggi(int tinggi){
        this.tinggi=tinggi;
    }
    
    public void setLuasAlas(double luas_alas){
        this.luas_alas=luas_alas;
    }
    
    public void computeAndSetVolume(){
        double calculate_vol=luas_alas*tinggi/3;
        this.volume=calculate_vol;
    }
    
    public double getVolume(){
        return this.volume;
    }
}
