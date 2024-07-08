public class Count2 implements Runnable{
	int c2 = 20;
	
	public void run() {
		while (c2 > 0) {
			System.out.println(c2);
			c2--;
		}
		System.out.println(c2);
	}
}