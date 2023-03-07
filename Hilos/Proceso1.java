public class Proceso1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 2; i++) {
            System.out.println("Proceso 1:\nSon multitarea y se veran como si los procesos fueran aleatorios");
        }
    }
}