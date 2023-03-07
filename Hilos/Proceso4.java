import java.lang.Math;

public class Proceso4 extends Thread{
    
    @Override
    public void run() {
        
        for (int i = 0; i <= 2; i++) {
            double resultado = Math.random()*30+1;
            System.out.println("Proceso 4, numeros aleatorios:\n"+resultado);
        }  
    }
    
}