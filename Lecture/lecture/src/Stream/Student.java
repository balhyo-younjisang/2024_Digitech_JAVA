package Stream;

// 자바 Collection에 비교를 위한 인터페이스가 있다
// Compareable
// Comparator
public class Student implements Comparable<Student> {
	private String name;
	private int age;
	private int money;
	
	// 생성자는 특별한 메소드로
	// 리턴값 없고, 클래스 이름과 같다
	// 생성자가 없으면 기본생성자를 JVM에서 실행할 때 만들어준다.
	// 매개변수가 있는 생성자를 만들면 기본 생성자를 사용하기 위해서는
	// 반드시 기본 생성자를 만들어줘야 한다,
	public Student(String name, int age, int money) {
		this.name = name;
		this.age = age;
		this.money = money;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public int compareTo(Student o) {
		return this.age - o.getAge();
	}
	
	
}
