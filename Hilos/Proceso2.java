public class Proceso2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 2; i++) {
            System.out.println("Proceso 2:\nCon los hilos, los procesos se ejecutan en paralelo");
        }
    }
}