import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
 

public class HilosSonido_Principal extends Thread
{
    
    public static void main(String[] args) 
    {
        Thread hilo1 = new Thread(new Proceso1());
        Thread hilo2 = new Thread(new Proceso2());
        Thread hilo3 = new Thread(new Proceso3());
        Thread hilo4 = new Thread(new Proceso4());
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        
       String ruta = "C:\\Users\\Marzo\\Desktop\\Taller2\\lofi-beat-140856.wav";	   
       run(ruta);
       JOptionPane.showMessageDialog(null, "Presiona OK para detener la musica");  
    }
    
    public static void run(String location)
    {
        try
        {
            File musicPatch = new File(location);
            
            if(musicPatch.exists())
            {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPatch);
                Clip sonido = AudioSystem.getClip();
                sonido.open(audioInput);
                sonido.start();
            }
            else{
                System.out.println("No se encuentra la ruta del archivo");
            }
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }

}