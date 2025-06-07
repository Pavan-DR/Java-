public class pos {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 5, 4, 7 };
		int sum = 0;
		int sixpos = -1;
		int sevenpos = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 6)
				sixpos = i;
			if (array[i] == 7)
				sevenpos = i;
		}
		if (sevenpos == -1)
			sixpos = -1;
		for (int i = 0; i < array.length; i++) {
			if (sixpos != -1 && i >= sixpos && i <= sevenpos)
				continue;
			sum += array[i];
		}
		System.out.println(sum);
	}

}
