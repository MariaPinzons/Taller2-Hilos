public class Proceso3 extends Thread{
    
    @Override
    public void run() {
        for (int i = 0; i <= 2; i++) {
            System.out.println("Proceso 3, suma:\n878 + 554 = "+(878+554));
        }    
        
    }
    
}