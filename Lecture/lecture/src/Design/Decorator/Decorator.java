package Design.Decorator;

public class Decorator implements IService{
	IService iService;
	
	@Override
	public String doSomething() {
		// TODO Auto-generated method stub
		Service service = new Service();
		return "심부름 " + service.doSomething();
	}

}
