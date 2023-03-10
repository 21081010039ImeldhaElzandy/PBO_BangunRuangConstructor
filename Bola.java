package kubus;
public class Bola {
    public int radius;
    public double volume;
    
    public Bola(int radius){
        this.radius=radius;
    }
    
    public Bola(){
        this.radius=0;   
    }
    
    public void setRadius(int radius){
        this.radius=radius;
    }
    
    public void computeAndSetVolume(){
        double calculate_vol=4*Math.PI*radius*radius*radius/3;
        this.volume=calculate_vol;
    }
    
    public double getvolume(){
        return this.volume;
    }
}
