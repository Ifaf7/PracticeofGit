package testexample;

public class findingKthlargest {

	public static void main(String[] args) {
		int[] arr= {2,7,5,27,9,12,18,13};
		int largest = arr[arr.length-1];
		for (int i=arr.length-2;i>0; i--) {
			if(largest<arr[i])
			{
				largest=arr[i];
			}
		}
		System.out.println(largest);
		int smallest =arr[0];
		for (int i=1;i<arr.length-1; i++) {
			if(smallest>arr[i])
			{
				smallest=arr[i];
			}
		}
		System.out.println(smallest);
	}

}
