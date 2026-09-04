public class ThreadDemo {

    static class Task extends Thread {

        @Override
        public void run() {
            System.out.println("Task is running");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Task();

        thread.start();
        thread.join();

        System.out.println("Completed");
    }
}
