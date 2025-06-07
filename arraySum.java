package program;

public class array {
	int smallest(int arr[], int n) {
		int res = 1;
		for (int i = 0; i < n && arr[i] <= res; i++)
			res += arr[i];
		return res;
	}

	public static void main(String[] args) {
		array a = new array();
		int arr1[] = { 1, 3, 4, 5 };
		int n1 = arr1.length;
		System.out.println(a.smallest(arr1, n1));
		int arr2[] = { 1, 2, 6, 10, 11, 15 };
		int n2 = arr2.length;
		System.out.println(a.smallest(arr2, n2));
	}

}
