package Lambda;

// 자바 8에서부터 함수형 프로그래밍을 지원하기 시작
// 함수의 구현과 수행으로 프로그램이 구성되어 있는 것이 함수형 프로그램이다.

// 형식
// (매개변수들)->(명령문들)
// 매개변수가 하나만 존재해야하는 경우 괄호 생략 가능
// 매개변수 -> (명령문들)
// 명령문이 한 개인 경우
// (매개변수들) -> 명령문
// 실행문이 return 문만 있는 경우 return 생략 가능
// (매개변수들) -> 값
public class AddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Add add = (a, b) -> return a + b;
		Add add = (a, b) -> a + b;
		MyPrint myPrint = (s) -> System.out.println(s);
		
		System.out.println(add.add(3, 5));
		myPrint.myPrint("함수형 프로그래밍으로 출력");
		
		String s1 = "용산구";
		String s2 = "회나무로 12길 27";
		
		// 객체지향 프로그래밍
		StringContcatImpl sci = new StringContcatImpl();
		sci.makeString(s1, s2);
		
		// 람다식 프로그래밍
		StringConcat sc = (s, v) -> System.out.println(s + " " + v);
		sc.makeString(s1, s2);
		
		// 메인에서 바로 구현
		StringConcat sc2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				// TODO Auto-generated method stub
				System.out.println(s1 + " " + s2);
			}
		};
		sc.makeString(s1, s2);
	}

}
