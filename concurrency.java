public class concurrency {
	public static void main(String[] args) throws InterruptedException {
		Count1 c1 = new Count1();
		Count2 c2 = new Count2();
		
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		
		t1.start();
		t1.join();
		System.out.println("Thread 2 start: ");
		t2.start();
		t2.join();
	}
}