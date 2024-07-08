public class Count1 implements Runnable{
	int c1 = 0;
	
	public void run() {
		while (c1 < 21) {
			System.out.println(c1);
			c1++;
		}
	}
}