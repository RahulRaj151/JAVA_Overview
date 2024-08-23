public class Multi_Threads{
  
    public static void main(String[] args) throws InterruptedException{  

    	// Create a subclass of Thread
    	MyMultithread thread1 = new MyMultithread();
    	  
    	//or 
    	
    	//implement Runnable interface and pass instance as an argument to Thread() 
    	MyRunnable runnable1 = new MyRunnable();
    	Thread thread2 = new Thread(runnable1);
    	
    	
    	//thread1.setDaemon(true);
    	//thread2.setDaemon(true);
    	
    	thread1.start();
    	//thread1.join(); //calling thread (ex.main) waits until the specified thread dies or for x milliseconds
    	thread2.start();
    	
    	//System.out.println(1/0);
    } 
}
class MyMultithread extends Thread{

	@Override
	public void run() {
		
		for(int i =10;i>0;i--) {
			System.out.println("Thread #1 : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread #1 is finished :)");
	}
}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		
		for(int i =0;i<10;i++) {
			System.out.println("Thread #2 : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread #2 is finished :)");
	}
}