//the most basic use of the Thread class
//put the runnable class to Thread constructor
public class BasicThreads{
	public static void main(String[] args){
		Thread t = new Thread(new LiftOff());
		t.start();
		System.out.println("waiting for LiftOff");
	}
}
//LiftOff.run() was run by different Thread, 
//so main() can still run other task
//start()  was returned quickly before countDown

