public class CustomThread implements Runnable {

    static boolean isRunning;

    public CustomThread(){
        isRunning = true;
    }

    @Override
    public void run() {
        heavy();
    }

    public static void heavy(){

        while(isRunning){
                System.out.println("Поток работает");

        }
    }

    public static void stop(){
        isRunning = false;
    }
}
