
package escriturayentrada;


public class Vaca {
 private int pulso;
private int ritmoCardiaco;
private double temperatura;

    
public Vaca (int pulso,int ritmoCardiaco,double temperatura){
    
    this.pulso = pulso;
    this.ritmoCardiaco=ritmoCardiaco;
    this.temperatura=temperatura;
    
    
           
 
 
 
 }  

    public int getPulso() {
        return pulso;
    }

    public void setPulso(int pulso) {
        this.pulso = pulso;
    }

    public int getRitmoCardiaco() {
        return ritmoCardiaco;
    }

    public void setRitmoCardiaco(int ritmoCardiaco) {
        this.ritmoCardiaco = ritmoCardiaco;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }


}
