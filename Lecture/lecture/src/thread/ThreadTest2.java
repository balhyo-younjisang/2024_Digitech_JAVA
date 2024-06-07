package thread;

class MyThread2 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i < 100; i++) {
			System.out.println(i + "\t");
		}
	}
}

public class ThreadTest2 {
	public static void main(String[] args) {
		// currentThread를 출력하면
		// 어디에서 호출했는지, 우선순위, Thread가 속한 곳
		System.out.println(Thread.currentThread() + " started");
		
		MyThread2 runnable = new MyThread2();
		
		// Thread를 생성할 때 개발자가 작성한 runnable을 매개변수 인자로 만들어서 실행
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();
		
		System.out.println(Thread.currentThread() + " ended");
		
		// 직접 runnable을 생성해서 Thread를 만들고 실행할 수 있다.
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("run");
			}
		};
		
		run.run();
	}
}
