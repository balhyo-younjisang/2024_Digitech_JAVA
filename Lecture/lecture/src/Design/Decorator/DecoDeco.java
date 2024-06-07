package Design.Decorator;

public class DecoDeco implements IService{
	IService iservice;

	@Override
	public String doSomething() {
		this.iservice = new Decorator();
		
		return "최상의 " + iservice.doSomething();
	}
	
	
}
