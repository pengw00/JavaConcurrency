import java.util.concurrent.*;
public class CachedThreadPool{
	public static void main(String[] args){
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i =0; i<5; i++){
			exec.execute(new LiftOff());
		}
		exec.shutdown();
	}
}
//all the thread must be yiele before shutdown() running, otherwise will 
//yield a rejectedexecutionException 

