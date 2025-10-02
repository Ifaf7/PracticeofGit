package testexample;

public class reverseWordsOfStrings {

	public static void main(String[] args) {
		String str = "My taming star";
		
		String[] strong = str.split(" ");
		StringBuilder result = new StringBuilder();
		for(String word : strong )
		{
			String reverseWord = new StringBuilder(word).reverse().toString();
			result.append(reverseWord).append(" ");
		}
		System.out.println(result.toString().trim());

	}

}
