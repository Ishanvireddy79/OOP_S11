package practical1;

public class Arrays {
	public static void main(String[]args) {
		int[]numbers = {10,20,30,40,50};
		System.out.println("Array elements:");
		for (int i=0;i<numbers.length;i++) {
			System.out.println("Elements at index"+i+":"+numbers[i]);
		}
		int sum = 0;
		for (int num: numbers) {
			sum+=num;
		}
		System.out.println("Sum of array elements:"+sum);
		numbers[2]=35;
		System.out.println("Updated element at index 2:"+numbers[2]);
	}
}
