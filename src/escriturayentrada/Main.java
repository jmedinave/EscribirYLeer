package escriturayentrada;
import java.lang.*;

import java.io.File;
import java.io.FileInputStream;
public class Main {
   
    public static int[] _pulso={80,81,82,83,84,85} ;
    public static int _ritmoCardiaco=80;
    public static double[] _temperatura={35 , 35.5 , 36 , 36.5 , 37};
    public static int ciclo=0; 
    
  Vaca v1 = new Vaca(_pulso[0],_ritmoCardiaco,_temperatura[0]);
Vaca v3 = new Vaca(_pulso[1],_ritmoCardiaco,_temperatura[1]);
Vaca v4 = new Vaca(_pulso[2],_ritmoCardiaco,_temperatura[2]);   
Vaca v5 = new Vaca(_pulso[3],_ritmoCardiaco,_temperatura[3]);    
Vaca v6 = new Vaca(_pulso[4],_ritmoCardiaco,_temperatura[4]); 
  public static void main(String[] args) throws Exception {

      

Metodos m=new Metodos();


m.Escribir("variables");
m.Leer("variables");
   

    }    

  
}
