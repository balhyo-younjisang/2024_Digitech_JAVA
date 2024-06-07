package Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

class CompareAge implements BinaryOperator<Integer> {

	@Override
	public Integer apply(Integer t, Integer u) {
		if(t >= u) return u;
		else return u;
	}
	
}

class moneyComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		// 무엇을 비교할지 정확히 모르기 때문에 Object로 비교할 때 사용함
		// Object를 매개변수로 받아옴
		// 반드시 강제 형변환을 해서 사용해야 함.
		int money1 = ((Student) o1).getMoney();
		int money2 = ((Student) o2).getMoney();
		
		// 리턴할 때 첫번째 매개변수 - 두번쨰 매개변수의 값을 넣으면 오름차순으로 정렬
		// 리턴할 때 두번째 매개변수 - 첫번째 매개변수의 값을 넣으면 내림차순으로 정렬
		return money1 - money2;
	}
	
}

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student("김영호", 16, 10_000);
		Student yoon = new Student("윤지상", 16, 20_000);
		Student hong = new Student("홍의준", 17, 1_500);
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(hong);
		studentList.add(yoon);
		studentList.add(kim);
		
		// 학생의 이름 출력하기
		studentList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		// 용돈의 합계 출력하기
		System.out.println(studentList.stream().mapToInt(c -> c.getMoney()).sum());
		// 16살인 학생 출력하기
		studentList.stream().filter(c -> c.getAge() == 16).map(c -> c.getName()).forEach(s -> System.out.println(s));
		// 16살인 학생의 이름 정렬하여 출력
		studentList.stream().filter(c -> c.getAge() == 16).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
		
		// 학생의 나이순으로 출력하기
		System.out.println();
		System.out.println("학생의 나이순으로 출력 1");
		Collections.sort(studentList);
		studentList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		System.out.println();
		System.out.println("학생의 나이순으로 출력 2");
		studentList.stream().sorted(Comparator.comparing(Student::getAge)).map(c -> c.getName()).forEach(s -> System.out.println(s));
	
		// 학생 섞기
		System.out.println();
		System.out.println("학생 섞기");
		Collections.shuffle(studentList);
		studentList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
	
		// 학생을 용돈 순으로 다시 정렬
		System.out.println();
		System.out.println("학생을 용돈 순으로 정렬");
		Collections.sort(studentList, new moneyComparator());
		studentList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		// 학생의 나이순으로 이름으로 내림차순으로 출력하기
		System.out.println();
		System.out.println("학생의 용돈 순으로 이름으로 내림차순으로 출력하기");
		Collections.reverse(studentList);
		studentList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
	}

}
