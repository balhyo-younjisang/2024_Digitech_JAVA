package thread;

//Thread 란?
// Process 실행 중인 프로그램은 OS로부터 메모리를 할당받아서 프로세스 상태가 된다.
// 하나의 프로세스는 하나 이상의 Thread 를 가지게 되고 실제 작업을 수행하는 단위가 Thread 이다.

// multi-threading
// 여러 thread 가 동시에 수행되는 프로그램
// 여러 작업이 동시에 실행되는 효과를 가짐
// thread 는 각자 자신의 공간을 가짐
// 각 thread 간에 공유하는 자원이 있을 수 있다.
// 여러 Thread 간에 자원을 공유해서 작업이 수행되는 경우에는 서로 자원을 차지하려고 하는 경우가 발생할 수 있다. ( Dead Lock , 교착상태 )
// 여러 Thread가 자원을 공유하는 경우, 교착상태가 발생하면 그 부분을 Critical section ( 임계 영역 ) 이라고 한다.
// Critical section 에 대한 동기화 ( 일종의 순차적 수행 ) 을 구현하지 않으면 오류가 발생할 수 있다.
// 자바에서는 Synchronized method 를 사용한다.

class MyThread extends Thread {

	public void run() {
		// Thread에서 작업하려는 코드를 여기에 적어주면 된다.
		int i;
		for(i = 0; i < 100; i++) {
			System.out.print(i + "\t");
		}
	}
	
}

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread() + " started");
		
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.start();
		th2.start();
		
		System.out.println(Thread.currentThread() + " ended");
	}

}
