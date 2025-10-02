package testexample;

public class reverseWords {

	public static void main(String[] args) {
		String str = "My Job is done";
		String[] strin = str.split(" ");
		String reverse = "";
		for(int i=strin.length-1;i>=0;i--) {
			reverse= reverse+strin[i]+" ";
			
		}
		System.out.println(reverse);
		

	}

}
