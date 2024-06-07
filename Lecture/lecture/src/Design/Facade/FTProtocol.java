package Design.Facade;

public class FTProtocol {
	public FTProtocol(String host, String path) {
		// TODO Auto-generated constructor stub
		System.out.println("FTP " + host + " server createed and open path " + path);
	}
	
	public void connect() {
		System.out.println("FTP connected!!");
	}
	public void disconnect() {
		System.out.println("FTP disconnected!!");
	}
	
	public void moveDiretory() {
		System.out.println("move path");
	}
}
