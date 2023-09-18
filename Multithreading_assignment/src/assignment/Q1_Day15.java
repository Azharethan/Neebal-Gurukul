package assignment;
class Alphabet extends Thread{
	public void run() {
		for (char i = 'A'; i<='Z'; i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
class Number extends Thread{
	public void run() {
		for (int i = 1; i <=26; i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
public class Q1_Day15 {
	public static void main(String[] args) {
		Alphabet t=new Alphabet();
		Number t1 = new Number();
		t.start();
		t1.start();
		
		
		
	}
}
