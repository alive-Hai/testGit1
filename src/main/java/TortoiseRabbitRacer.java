import javax.lang.model.element.VariableElement;

public class TortoiseRabbitRacer implements Runnable {

    private static String winner;

    @Override
    public void run() {
        for (int steps = 0; steps <= 100; steps++) {
            System.out.println(Thread.currentThread().getName() + "  stepssssssssss=" + steps);
            boolean flag = gameOver(steps);
            if(flag){
                break;
            }
        }

    }

    private boolean gameOver(int steps) {

        if (winner != null) {
            return true;
        } else if (steps == 100) {
            winner = Thread.currentThread().getName();
            System.out.println("winner is " + winner );
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        TortoiseRabbitRacer tortoiseRabbitRacer = new TortoiseRabbitRacer();

        Thread tortoise = new Thread(tortoiseRabbitRacer, "tortoise");
        tortoise.start();

        Thread rabbit = new Thread(tortoiseRabbitRacer, "rabbit");
        rabbit.start();

    }
}
