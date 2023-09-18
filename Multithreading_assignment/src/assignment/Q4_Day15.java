package assignment;

class MyRunnable implements Runnable {
    private String[] courses;

    public MyRunnable(String[] courses) {
        this.courses = courses;
    }

    public void run() {
        for (String course : courses) {
            System.out.println(Thread.currentThread().getName() + ": " + course);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Q4_Day15 {
    public static void main(String[] args) {
        String[] courses = {"Java", "J2EE", "Spring", "Struts"};
        Runnable runnable = new MyRunnable(courses);

        Thread t1 = new Thread(runnable, "Thread 1");
        Thread t2 = new Thread(runnable, "Thread 2");
        Thread t3 = new Thread(runnable, "Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
