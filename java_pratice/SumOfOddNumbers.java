public class SumPositiveOddNums {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		int sum = 0;
		//iterating from 1 to 20
		for(int i=1; i<=array.length; i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		System.out.println(sum);
