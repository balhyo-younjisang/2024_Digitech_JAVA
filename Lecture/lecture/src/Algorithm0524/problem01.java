package Algorithm0524;

import java.util.ArrayList;
import java.util.Scanner;

public class problem01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int min_idx = 0;
		int max_idx = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
				min_idx = i;
			}
			
			if(arr[i] > max) {
				max = arr[i];
				max_idx = i;
			}
		}
		
		System.out.printf("가장 큰 값은 %d이고 %d번째에 있습니다\n", max, max_idx);
		System.out.printf("가장 작은 값은 %d이고 %d번째에 있습니다", min, min_idx);
	}

}
