package Design.Facade;

public class FTPClient {
	private FTProtocol ftpProtocol;
	private FileWriter fileWriter;
	private FileReader fileReader;
	
	public FTPClient(String host, String path, String fileName) {
		this.ftpProtocol = new FTProtocol(host, path);
		this.fileWriter = new FileWriter(fileName);
		this.fileReader = new FileReader(fileName);
	}
	
	public void connect() {
		this.ftpProtocol.connect();
		this.fileReader.FileConnector();
		this.fileWriter.FileConnector();
	}
	
	public String read() {
		return this.fileReader.FileRead();
	}
	
	public void write(String content) {
		this.fileWriter.fileWriter(content);
	}
	
	public void disconnect() {
		this.fileWriter.FileDisconnector();
		this.fileReader.FileDisconnector();
		this.ftpProtocol.disconnect();
	}
}
