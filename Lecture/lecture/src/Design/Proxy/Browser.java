package Design.Proxy;

public class Browser implements IBrowser {
	private HTML html;
	private String url;
	
	public Browser(String url) {
		this.url = url;
	}

	@Override
	public HTML show() {
		System.out.println("browser loading " + url);
		return new HTML(url);
	}
}
