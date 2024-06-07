package Algorithm0524;

public class problem02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12, 25, 31, 46, 54, 66, 80, 83, 95, 100};
		
		int find_num = 80;
		int start = 0;
		int end = arr.length - 1;
		int result = 0;
		
		while(start < end) {
			int middle = (start + end) / 2;
			
			if(arr[middle] == find_num) {
				result = middle;
				break;
			} else if(arr[middle] < start) {
				end--;
			} else if(arr[middle] > end) {
				start++;
			}
		}
		
		System.out.printf("%d는 배열의 %d번째에 있습니다", find_num, result + 1);
	}

}
