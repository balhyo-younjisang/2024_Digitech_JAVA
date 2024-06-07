package Interface;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calculator = new CompleteCalc();
		
		int n1 = 10;
		int n2 = 3;
		
		calculator.description();
		System.out.println(calculator.add(n1, n2));
		System.out.println(calculator.substract(n1, n2));
		System.out.println(calculator.multi(n1, n2));
		System.out.println(calculator.divide(n1, n2));
		
	}

}
