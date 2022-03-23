package easy.array;

public class MakingAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "cde", b = "abc";
		System.out.println(makeAnagram(a, b));
	}

	public static int makeAnagram(String a, String b) {
		// Write your code here
		int count = 0, total = a.length()+b.length();
		char arr1[] = a.toCharArray(), arr2[] = b.toCharArray();
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					count++;
					arr2[j] = '1';
					break;
				}
			}
		}
		return total - count*2;
	}

}
