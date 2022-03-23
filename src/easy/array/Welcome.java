package easy.array;

/**
 *1. Assume that the input will be a word with odd letter count. Print the output as given below.
    
Input : W E L C O M E
Explanation : 
start with middle letter from first line. Next line two letter from middle .
 Continue still you print all letters in last line. 
 Then start with the first letter and continue for the remaining letters. 
output :  


                     C
                 C O
              C O M
           C O M E
       C O M E W
   C O M E W E
C O M E W E L

Input : W A T E R
Output :

            T
         T E
      T E R
   T E R W
T E R W A 
 *
 */

public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "water";
		int length = input.length();
		int start_index = input.length()/2, start_at=input.length()-1;
		int jj=0;
		//time complexity will be O(n^2) as we are increasing j inside inner loops 
		for(int i=0;i<length; i++) {
			for(int j=0; j<length;) {
				for(int k=0;k<start_at;k++,j++) {
					jj++;
					System.out.print(" ");
				}
				for(int n=start_index; n<length && j<length; n++, j++) {
					jj++;
					System.out.print(input.charAt(n));
				}
				for(int m=0; m<length && j<length; m++, j++) {
					jj++;
					System.out.print(input.charAt(m));
				}
			}
			start_at--;
			System.out.println();
		}
		System.out.println(jj);
	}

}
