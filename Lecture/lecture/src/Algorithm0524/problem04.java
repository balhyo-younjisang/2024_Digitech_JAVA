package Algorithm0524;

public class problem04 {
	static final int[] tree = { 10, 30, 20, 50, 60, 70, 40, 80};
	
	public static void create_heap(int i, int tree_size) {
		int largest = i;
		int left_idx = 2 * i + 1, right_idx = 2 * i + 2;
		
		if(left_idx < tree_size && tree[left_idx] > tree[largest]) {
			largest = left_idx;
		}
		
		if(right_idx < tree_size && tree[right_idx] > tree[largest]) {
			largest = right_idx;
		}
		
		if(largest != i) {
			int tmp = tree[i];
			tree[i] = tree[largest];
			tree[largest] = tmp;
			
			create_heap(largest, tree_size);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = tree.length / 2 - 1; i >= 0; --i) {
			create_heap(i, tree.length);
		}
		
		for(int i = tree.length - 1; i > 0; --i) {
			int tmp = tree[0];
			tree[0] = tree[i];
			tree[i] = tmp; 
			
			create_heap(0, i);	
		}
		
		for(int i = 0; i < tree.length; i++) {
			System.out.printf("%d ", tree[i]);
		}
	}

}
