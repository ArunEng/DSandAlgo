package easy.array;

public class RepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcac";
		int n = 10;
		System.out.println(repeatedString(s, n));
	}

	public static long repeatedString(String s, long n) {
		// Write your code here
		long total = 0, single = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'a') {
				single++;
			}
		}
		long c = n/s.length();
		total += c*single;
		long remaining = n%s.length();
		for(int i=0; i<remaining; i++) {
			if(s.charAt(i) == 'a') {
				total++;
			}
		}
		return total;
	}

}
