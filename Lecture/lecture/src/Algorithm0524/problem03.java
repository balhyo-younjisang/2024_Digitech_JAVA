package Algorithm0524;

public class problem03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {50, 80, 70, 10, 60, 20, 40, 30};
		int i = 0, j = 0;
		
		for(i = 1; i < arr.length; i++) {
			int now = arr[i];
			
			for(j = i - 1; j >= 0 && arr[j] > now; j--) {
				arr[j+1] = arr[j];
			}
			
			arr[j + 1] = now;
		}
			
		for(i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
	}

}
