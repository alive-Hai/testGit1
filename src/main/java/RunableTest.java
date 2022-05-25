public class RunableTest implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("IIIIIIIIIIIIIIIIIIIIIII");

        }
    }

    public static void main(String[] args) {
        RunableTest rt = new RunableTest();//实现类
        Thread t = new Thread(rt);//代理类
        t.start();//开新线程

        for (int i = 0; i <1000;i++) {
            System.out.println("口口口口口口口口口口口口");

        }

    }
}
