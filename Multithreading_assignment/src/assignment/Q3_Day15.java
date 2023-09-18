package assignment;


	class MyThread extends Thread {
	    public MyThread(String name) {
	        super(name); 
	    }

	    public void run() {
	        System.out.println(getName() + " is running.");
	    }
	}

	public class Q3_Day15 {
	    public static void main(String[] args) {
	        MyThread t1 = new MyThread("Thread 1");
	        MyThread t2 = new MyThread("Thread 2");

	       
	        t1.start();
	        t2.start();

	        boolean t1IsAlive = t1.isAlive();
	        boolean t2IsAlive = t2.isAlive();

	        System.out.println("Is Thread 1 running? " + t1IsAlive);
	        System.out.println("Is Thread 2 running? " + t2IsAlive);
	    }
	}


