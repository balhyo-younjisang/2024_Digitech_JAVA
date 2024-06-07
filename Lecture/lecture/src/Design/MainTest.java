package Design;

import Design.Adapter.E220V;
import Design.Adapter.HairDryer;
import Design.Adapter.SocketAdapter;
import Design.Adapter.TV;
import Design.Facade.FTPClient;
import Design.Observer.IButton;
import Design.Observer.IButtonClickListener;
import Design.Singleton.AClass;
import Design.Singleton.BClass;
import Design.Singleton.SocketClient;
import Design.Strategy.Base64Encoding;
import Design.Strategy.Encoder;
import Design.Strategy.NormalEncoding;

public class MainTest {
	public static void main(String[] args) {

		// Singleton 패턴
		// socket 통신을 위해서 또는 bean 객체를 주고 받을 때 등
		// 데이터를 공유하고자 할 때 사용한다.
		
//		AClass aclass = new AClass();
//		BClass bclass = new BClass();
//		
//		SocketClient aClient = aclass.getSocketClient();
//		SocketClient bClient = bclass.getSocketClient();
//		
//		System.out.println(aClient.equals(bClient));
//		System.out.println(aclass.equals(bclass));
		
		// Adapter 패턴
		// 비슷한 작업을 하는 경우 내부에서 다르게 동작 하더하도
		// 외부에서 동일한 메소드 이름을 생성하도록 하는 패턴
		
//		HairDryer hairDryer = new HairDryer();	// 110V이고 connect로 ㅇn
//		TV myTV = new TV();						// 220V이고 powerOn으로 on
//		
//		hairDryer.connect();
//		myTV.powerOn();
//		
//		// Adapter를 사용해서 동일하게 구현하면
//		E220V adapterHairDryer = new SocketAdapter(hairDryer);
//		adapterHairDryer.powerOn();
		
		// Proxy Pattern
//		Browser browser = new Browser("www.naver.com");
//		browser.show();
//		browser.show();
//		
//		IBrowser browser2 = new BrowserProxy("www.naver.com");
//		browser2.show();
//		browser2.show();
//		browser2.show();
		
		// Decorator Pattern
//		IService service = new Decorator();
//		System.out.println(service.doSomething());
//		IService service2 = new DecoDeco();
//		System.out.println(service2.doSomething());
		
		// Observer Pattern
//		IButton myButton = new IButton("확인버튼");
//		IButtonClickListener buttonClickListener = event -> System.out.println("click event " + event);
//		myButton.addListener(buttonClickListener);
//		
//		myButton.click("한번 클릭");
//		myButton.click("두번 클릭");
//		myButton.click("세번 클릭");
		
		// Facade Pattern
//		FTPClient ftpClient = new FTPClient("www.naver.com", "/home/content", "my book");
//		ftpClient.connect();
//		System.out.println(ftpClient.read());
//		ftpClient.write("Lee Jeongwook is stupid");
//		ftpClient.disconnect();
		
		// Strategy Pattern
		// 행위 패턴
		// 행위 패턴은 반복적으로 사용되는 객체들의 상호작용을 패턴화한다.ㅣ
		Encoder base64Encoder = new Encoder();
		base64Encoder.setEncodingStrategy(new Base64Encoding());
		System.out.println(base64Encoder.getMessage("message"));
		

		Encoder normalEncoder = new Encoder();
		normalEncoder.setEncodingStrategy(new NormalEncoding());
		System.out.println(normalEncoder.getMessage("message"));
	}
}
