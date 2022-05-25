public class ThreadTest extends  Thread{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(1);
        }
    }

    public static void main(String[] args) {
        ThreadTest tt = new ThreadTest();
        tt.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println(2);
        }
    }
}
