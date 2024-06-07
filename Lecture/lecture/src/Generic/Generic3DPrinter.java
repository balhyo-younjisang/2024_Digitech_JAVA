package Generic;

// Generic은 객체를 만들 때 어떤 데이터 타입을 사용할지 결정이 되지 않았을 때 사용
// 사용 방법은 대문자 알파벳을 <> 안에 집어넣어서 사용한다
// T, S, V, E 를 보통 사용하는데 어떤 알파벳을 사용하여도 무방하다
// <T> 자료형 매개변수라고 부른다
// E element , K key , V value ...  
public class Generic3DPrinter<T> {
	
	private T material;
	
	public T getMaterial() {
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material;
	}
}
