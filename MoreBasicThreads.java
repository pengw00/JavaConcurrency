// concurrency/morebasicThreads.java
//add more Threads
//different thread maxup together
public class MoreBasicThreads{
	public static void main(String[] args){
		for(int i = 0; i < 5; i++){
			new Thread(new LiftOff()).start();
			System.out.println("waiting for LiftOff");
		}
	}
}
//thread dispatcher auto dispatch the thread
//unsurable every time the result is different
 //the best way to program multithread is more 保守的
 //对thread的回收不一样，普通来说垃圾回收器会回收，但mian（）
//创建thread时，run完以后并不会回收。