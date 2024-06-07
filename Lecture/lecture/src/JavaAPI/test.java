package JavaAPI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class test {
	// Java Lang
	// Language 자체와 밀접한 클래스들이 포함되어 있다
	// new 연산자를 통해 생성하지 않아도 사용할 수 있는 객체들이 Lang 클래스에 담겨있다
	// Class 객체는 Lang 클래스에 담겨 바로 사용할 수 있다
	// forName() 메소드를 바로 사용 가능하다.
	// String 객체
	// String 객체도 Lang 클래스에 있어서 바로 사용 가능하다.
	// length, charAt(), valueOf(), subString() ... 멤버변수와 메소드를 사용 가능하다
	public static void main(String[] args) {
		try {
			// DB 연결
			// 1. 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			// 2. 연결 설정
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(url, "hr","1234");
			// 3. 질의문 준비
			String sql = "select * from users";
			PreparedStatement stmt = conn.prepareStatement(sql);
			// 4. 질의문 세팅
			// 5. 질의문 실행
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(1) + "/t" + rs.getString(2));
			}
			// 6. 닫기
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
