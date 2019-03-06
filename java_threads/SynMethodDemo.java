package java_threads;

/**
 * @author shekhar
 *
 */
class Action {
	private boolean flag;
	public synchronized void performAction() throws InterruptedException {
		for(int i =0; i<11;i++){
		System.out.println("old value of flag "+flag +"Thread name "+Thread.currentThread().getName());
		flag = !flag;
		System.out.println("new  value of flag "+flag +"Thread name "+Thread.currentThread().getName());
		Thread.sleep(1000);
		}
	}
}

public class SynMethodDemo {
	public static void main(String args[]) throws InterruptedException {
		System.out.println("Mian method");
		Action action = new Action();

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
			
						System.out.println("Operation by Thread1 ");
						action.performAction();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// TODO Auto-generated method stub
				
				
			}
		},"thread1");
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					System.out.println("Operation by Thread2 ");
					action.performAction();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// TODO Auto-generated method stub
				
			}
		},"thread2");
		
			thread1.start();
			thread2.start();
			
		
	}
}
